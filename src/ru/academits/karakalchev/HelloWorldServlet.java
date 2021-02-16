package ru.academits.karakalchev;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class HelloWorldServlet extends HttpServlet {
    private static final long serialVersionUID = 7667982769871659857L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.getOutputStream().write("Hello from HelloWorldServlet".getBytes(StandardCharsets.UTF_8));
        resp.getOutputStream().flush();
        resp.getOutputStream().close();
    }
}
