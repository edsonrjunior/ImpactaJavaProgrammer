package br.com.impacta.estacionamento.view.swing;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.TemporalAdjusters;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;


public class TelaRelatorioFaturamento extends JFrame {

	private JPanel contentPane;
	private JComboBox<Integer> cbAno;
	private JComboBox<String> cbMeses;
	private JTable tblMovimentacoes;
	private double totalFaturamento;
	private JFrame principal;

	public TelaRelatorioFaturamento(TelaPrincipal telaPrincipal) {
		this.principal = telaPrincipal;
		setTitle("Relat\u00F3rio de Faturamento");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 550, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setHgap(20);
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel lblAno = new JLabel("Ano :");
		panel.add(lblAno);
		
		cbAno = new JComboBox<Integer>();
		cbAno.setModel(new DefaultComboBoxModel<Integer>(new Integer[] {2010,2011,2012,2013,2014,2015,2016,2017,2018,2019,2020,2021,2022,2023,2024,2025,2026,2027,2028,2029,2030}));
		panel.add(cbAno);
		
		JLabel lblMes = new JLabel("M\u00EAs :");
		panel.add(lblMes);
		
		cbMeses = new JComboBox<String>();
		cbMeses.setModel(new DefaultComboBoxModel<String>(new String[] {"Janeiro", "Fevereiro", "Mar\u00E7o", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"}));
		panel.add(cbMeses);
				
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.SOUTH);
		
		JLabel lblRelatorio = new JLabel("Não há dados para cálculo do faturamento.");
		panel_1.add(lblRelatorio);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		panel_2.add(scrollPane);
		
		tblMovimentacoes = new JTable();
		tblMovimentacoes.setModel(new DefaultTableModel(
			null ,
			new String[] {
				"Placa", "Entrada", "Saída", "Valor"
			}
		) {

			private static final long serialVersionUID = 1L;
			@SuppressWarnings("rawtypes")
			Class[] columnTypes = new Class[] {
				Object.class, Object.class, String.class, Double.class
			};
			@SuppressWarnings("unchecked")
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		scrollPane.setViewportView(tblMovimentacoes);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int mes = cbMeses.getSelectedIndex()+1;
				int ano = (Integer) cbAno.getSelectedItem();
				atualizaTabela(ano,mes);
				lblRelatorio.setText(String.format("Foram arrecadados R$ %.2f no período.", totalFaturamento));
				
			}
		});
		panel.add(btnOk);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				dispose();
				principal.setVisible(true);
			}
		});
		
		this.setLocationRelativeTo(null);
	}
	
	public void atualizaTabela(int ano, int mes) {
		
		//instanciar o controller
		LocalDateTime dInicial = LocalDateTime.of(ano, Month.of(mes),1,0,0,0);
		LocalDateTime dFinal = dInicial.with(TemporalAdjusters.lastDayOfMonth()).withHour(23).withMinute(59).withSecond(59);
		//Chamar o metodo do controller para obert a lista de movimentacoes que atende o criterio
		
		DefaultTableModel tableModel = (DefaultTableModel) tblMovimentacoes.getModel();
	    tableModel.setRowCount(0);
	    
	    //trocar abaixo para considerar a lista de movimentacoes recuperada
		Object[][] tableData = new Object[1][4];
		for (int i = 0; i < 1; i++) {
			//Movimentacao movimentacao = movimentacoes.get(i);
			tableData[i][0] = "AAA-1111";//movimentacao.getVeiculo().getPlaca();
			tableData[i][1] = "07/07/7777 07:07";//movimentacao.getDataHoraEntrada().toString();
			tableData[i][2] = "08/08/8888 08:08";//movimentacao.getDataHoraSaida().toString();
			tableData[i][3] = 77.77;//movimentacao.getValor();
			this.totalFaturamento += 77.77;//movimentacao.getValor();
			tableModel.addRow(tableData[i]);
		}
		
	    tableModel.fireTableDataChanged();
	}

}
