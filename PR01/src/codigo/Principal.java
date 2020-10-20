package codigo;
 
import java.sql.SQLException;
import java.util.ArrayList;

import codigo.cfg.Config;
import codigo.db.DbObject;
import codigo.models.Persona;
import codigo.models.Producto;
import codigo.models.Usuario;

public class Principal {

	public static void main(String[] args) { 
				
		Config.getInstance();
		
		// =============================
		// Persona
		// =============================
		
		Persona per = new Persona();
		try{
			// ->  1.- Listar (Persona)
			System.out.println("Persona :: Listar"); 
			for (DbObject obj : per.list()) {
				Persona p1 = (Persona) obj;
				System.out.println("=>"+p1.toString() );
			}
			
			// -> 2.- Insertar (Persona)
			per.name     = "Nombre Persona 01";
			per.lastname = "Apellido Persona 01"; 	 
			per.insertar();
			
			per.name     = "Nombre Persona 02";
			per.lastname = "Apellido Persona 02"; 
			per.insertar();
			
			// -> 3.- Update
			per.name     = "Nombre Persona 03";
			per.lastname = "Apellido Persona 03"; 
			per.setId(3);
			per.update();
			
			// -> 4.- Listar (Persona)
			System.out.println("Persona :: Listar"); 
			for (DbObject obj : per.list()) {
				Persona p1 = (Persona) obj;
				System.out.println("=>"+p1.toString() );
			}
			
			// -> 5.- Delete (Persona)
			per.setId(1);
			per.delete();
			
			// -> 6.- Listar (Persona)
			System.out.println("Persona :: Listar"); 
			for (DbObject obj : per.list()) {
				Persona p1 = (Persona) obj;
				System.out.println("=>"+p1 );
			}
					
			
		}catch(Exception e) {
			 e.printStackTrace();
		}
		
		Producto pro = new Producto();
		try{
			// ->  1.- Listar (Producto)
			System.out.println("Producto :: Listar"); 
			for (DbObject obj : pro.list()) {
				Producto p1 = (Producto) obj;
				System.out.println("=>"+p1.toString() );
			}
			
			// -> 2.- Insertar (Producto)
			pro.setName("Nombre Producto 01");
			pro.setDesc("Descripcion Producto 01"); 	 
			pro.setPrecio(3);
			pro.setStock(4);
			
			pro.insertar();
			
			pro.setName("Nombre Producto 02");
			pro.setDesc("Descripcion Producto 02"); 	 
			pro.setPrecio(1);
			pro.setStock(2);
			
			pro.insertar();
			
			// -> 3.- Update (Producto)
			pro.setName("Nombre Producto 03");
			pro.setDesc("Descripcion Producto 03");
			pro.setPrecio(4);
			pro.setStock(5);
			pro.setId(2);
			
			pro.update();
			
			// -> 4.- Listar (Producto)
			System.out.println("Producto :: Listar"); 
			for (DbObject obj : per.list()) {
				Producto p1 = (Producto) obj;
				System.out.println("=>"+p1.toString() );
			}
			
			// -> 5.- Delete (Producto)
			pro.setId(2);
			
			pro.delete();
			
			// -> 6.- Listar (Producto)
			System.out.println("Producto :: Listar"); 
			for (DbObject obj : per.list()) {
				Producto p1 = (Producto) obj;
				System.out.println("=>"+p1.toString() );
			}
					
			
		}catch(Exception f) {
			 f.printStackTrace();
		}
		
		Usuario usu = new Usuario();
		try{
			// ->  1.- Listar (Usuario)
			System.out.println("Usuario :: Listar"); 
			for (DbObject obj : usu.list()) {
				Usuario u1 = (Usuario) obj;
				System.out.println("=>"+u1.toString() );
			}
			
			// -> 2.- Insertar (Usuario)
			usu.login = "DoctorWho";
			usu.pass  = "∂³∑x²"; 	 
			usu.edad = 1200;
			
			usu.insertar();
			
			usu.login = "DrGregoryHouse";
			usu.pass  = "MP3"; 	 
			usu.edad = 53;
			
			usu.insertar();
			
			// -> 3.- Update (Usuario)
			usu.login = "House";
			usu.pass  = "Catolicolimpiadas"; 	 
			usu.edad = 69;
			usu.setId(2);
			
			usu.update();
			
			// -> 4.- Listar (Usuario)
			System.out.println("Usuario :: Listar"); 
			for (DbObject obj : usu.list()) {
				Usuario u1 = (Usuario) obj;
				System.out.println("=>"+u1.toString() );
			}
			
			// -> 5.- Delete (Usuario)
			usu.setId(1);
			
			usu.delete();
			
			// -> 6.- Listar (Usuario)
			System.out.println("Usuario :: Listar"); 
			for (DbObject obj : usu.list()) {
				Usuario u1 = (Usuario) obj;
				System.out.println("=>"+u1.toString() );
			}
					
			
		}catch(Exception x) {
			 x.printStackTrace();
		}

		// create a database connection

		/*
		 * 
		 * statement.executeUpdate("drop table if exists person");
		 * 
		 * statement.executeUpdate("create table person (id integer, name string)");
		 * 
		 * statement.executeUpdate("insert into person values(1, 'leo')");
		 * statement.executeUpdate("insert into person values(2, 'yui')");
		 * 
		 * 
		 * 
		 * ResultSet rs = statement.executeQuery("select * from person");
		 * while(rs.next()) { // read the result set System.out.println("name = " +
		 * rs.getString("name")); }
		 * 
		 * 
		 * //
		 */

	}

}
