package com.dkyoutube.dineshyoutube.filter;

import javax.servlet.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
@Order(3)
public class MyFilter_2 implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Filter 2 is called....");
        filterChain.doFilter(servletRequest, servletResponse);
    }
}
