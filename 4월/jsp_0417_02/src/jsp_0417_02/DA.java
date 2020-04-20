package jsp_0417_02;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class DA {

	ArrayList<DT> dtos = new ArrayList<DT>();

	// db접속에 필요한 객체 선언

	DataSource datasource;
	Connection c = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	String id;
	String sql;

	public DA() {

		try {

			Context context = new InitialContext();
			datasource = (DataSource) context.lookup("java:comp/env/jdbc/oracle11g");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public ArrayList<DT> member_select() {
		
		sql = "select * from m2";
		
		try {

            c = datasource.getConnection();
			ps = c.prepareStatement(sql);
			rs = ps.executeQuery();

			// 데이터 담기
			while (rs.next()) {

				id = rs.getString("id");
				
				DT t = new DT(id);

				dtos.add(t);

			}

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			try {

				if (ps != null)
					ps.close();
				if (rs != null)
					rs.close();
				if (c != null)
					c.close();

			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

		// 리턴 값으로 돌려줌
		return dtos;

	}

}
