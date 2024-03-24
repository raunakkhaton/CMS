package com.dkyoutube.dineshyoutube.filter;

import org.springframework.stereotype.Component;
import javax.servlet.*;

import java.io.IOException;

@Component
public class MyNewFilter implements Filter {

    public void doFilter(ServletRequest servletRequest,ServletResponse servletResponse,FilterChain filterChain) throws IOException, ServletException{
        System.out.println("the new filter is calling");
        filterChain.doFilter(servletRequest, servletResponse);
    }

}
