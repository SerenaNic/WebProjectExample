package it.unirc.campo_coni.util;

import java.sql.Connection;





import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;


public class JDBCDAO {

//select bordero
	public static LinkedList<BorderoBean> getBordero(String ivr, int periodo) {
		LinkedList<BorderoBean> result = new LinkedList<>();

		Connection conn=null;
		conn=DBConnection.startConnection(conn);

		String selectTableSQL = "SELECT codice_ivr, periodo, num_record, stringa FROM DIGITALBE_DBA.SISAL_INCHIARO_BORDERO "
				+ "WHERE codice_ivr =? and periodo= ? order by periodo desc";

		PreparedStatement preparedStatement;
		try {
			preparedStatement = conn.prepareStatement(selectTableSQL);

			preparedStatement.setString(1, ivr);
			preparedStatement.setInt(2, periodo);

			ResultSet rs= preparedStatement.executeQuery();
     
			while (rs.next()) {
				BorderoBean b = new BorderoBean(rs.getString("codice_ivr"),rs.getInt("periodo"),rs.getInt("num_record"),rs.getString("stringa"));
				result.add(b);
			}
		}catch (java.lang.NullPointerException| SQLException e) {
			// TODO: handle exception
		}

		DBConnection.closeConnection(conn);
		return result;

	}

	public static int updateBordero(String ivr, int periodo,String ivrOld, int periodoOld) {
		Connection conn=null;
		conn=DBConnection.startConnection(conn);

		int result = 0;
		
		String selectTableSQL = "UPDATE DIGITALBE_DBA.SISAL_INCHIARO_BORDERO "
				+ "SET codice_ivr =? , periodo= ? WHERE codice_ivr =? and periodo= ?";

		PreparedStatement preparedStatement;
		try {
			preparedStatement = conn.prepareStatement(selectTableSQL);

			preparedStatement.setString(1, ivr);
			preparedStatement.setInt(2, periodo);
			preparedStatement.setString(3, ivrOld);
			preparedStatement.setInt(4, periodoOld);

			result= preparedStatement.executeUpdate();

			
		}catch (java.lang.NullPointerException| SQLException e) {
			// TODO: handle exception
		}

		DBConnection.closeConnection(conn);
		return result;
	}

}
