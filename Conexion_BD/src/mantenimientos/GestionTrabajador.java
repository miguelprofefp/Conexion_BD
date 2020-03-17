package mantenimientos;

import java.sql.Connection;
import java.sql.PreparedStatement;

import beans.Trabajador;
import utils.MySqlConexion;

public class GestionTrabajador {
	
	public void RegistrarEntradas(Trabajador data){
		
		Connection cnx = null;
		PreparedStatement pstm = null;
		
		try {
			
			cnx = MySqlConexion.getConexion();
			String sql = "INSERT INTO TRABAJADOR VALUES (?,?,?,?,?,?)";
			
			pstm = cnx.prepareStatement(sql);
			
			pstm.setString(1, data.getCod());
			pstm.setString(2, data.getNom());
			pstm.setString(3, data.getApe());
			pstm.setInt(4, data.getEdad());
			pstm.setInt(5, data.getGen_cod());
			pstm.setInt(6, data.getDep_cod());
			
			pstm.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstm != null){
					pstm.close();
				}
				if (cnx != null){
					cnx.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

}
