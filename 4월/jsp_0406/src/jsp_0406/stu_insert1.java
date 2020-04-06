package jsp_0406;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/S_1")
public class stu_insert1 extends HttpServlet implements Servlet {
	private static final long serialVersionUID = 1L;

	ArrayList<Student> list = new ArrayList<Student>();

	public stu_insert1() {
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("uft-8");

		ArrayList<Student> list = new ArrayList<Student>();

		String s_num1 = request.getParameter("s_num");
		String s_name1 = request.getParameter("s_name");
		int s_kor1 = Integer.parseInt(request.getParameter("s_kor"));
		int s_eng1 = Integer.parseInt(request.getParameter("s_eng"));
		int s_math1 = Integer.parseInt(request.getParameter("s_math"));

		Student stu = new Student(s_num1, s_name1, s_kor1, s_eng1, s_math1);
		list.add(stu);

	}

}
