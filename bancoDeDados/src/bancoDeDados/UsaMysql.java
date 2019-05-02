package bancoDeDados;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.JDBCType;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLType;

public class UsaMysql {
	
	public static void main(String[] args) {
		conectar();
	}

	private static void conectar() {
		
		String url = "jdbc:mysql://localhost:3306/sakila";
		String usuario = "root";
		String senha = "Imp@ct@";
		
		try (Connection connection = 
				DriverManager.getConnection(url,usuario,senha))
		{
			System.out.println("Conexão estabelecida com sucesso");
			
			//Linha de comando simples 
			//Statement stmt = connection.createStatement();
			//stmt.execute("select * from film where title like 'A%' ");
			
			//Linha de comando pre-compilado
			PreparedStatement ps = 
					connection.prepareStatement
						("select * from film where title like ?" );
			
			ps.setString(1, "A%");
			
			
			ResultSet view = ps.executeQuery();
			
			
			while(view.next()){
				
				int id = view.getInt("film_id");
				//ou id = view.getInt(1); 
				String titulo = view.getString("title");
				System.out.printf("%d - %s%n",id,titulo);
			}
			
			System.out.println("Consulta realizada com sucesso!");
			
//			CallableStatement cs = connection.prepareCall("? = inventory_in_stock(?)");
//			cs.registerOutParameter(1, JDBCType.TINYINT);
//			cs.setInt(2, 30);
//			
//			cs.execute();
//			
//			int resposta = cs.getInt(1);
//			System.out.println(resposta);
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
