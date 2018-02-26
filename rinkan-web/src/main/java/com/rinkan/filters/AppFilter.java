package com.rinkan.filters;

import javax.servlet.*;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;

public class AppFilter implements Filter {

    private void addHeadersFor200Response(HttpServletResponse response) {
        //TODO: externalize the Allow-Origin
        response.addHeader("Access-Control-Allow-Origin", "*");
        response.addHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, PUT, DELETE, HEAD");
        response.addHeader("Access-Control-Allow-Headers", "X-PINGOTHER, Origin, X-Requested-With, Content-Type, Accept");
        response.addHeader("Access-Control-Max-Age", "1728000");
    }

    public void init(FilterConfig filterConfig) throws ServletException {

    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        if (servletResponse instanceof HttpServletResponse) {
            HttpServletResponse alteredResponse = ((HttpServletResponse) servletResponse);
            // I need to find a way to make sure this only gets called on 200-300 http responses
            // TODO: see above comment
            addHeadersFor200Response(alteredResponse);
        }

        filterChain.doFilter(servletRequest, servletResponse);
    }

    public void destroy() {

    }

}
