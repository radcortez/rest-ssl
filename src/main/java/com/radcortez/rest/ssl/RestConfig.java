package com.radcortez.rest.ssl;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author Roberto Cortez
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.radcortez.rest.ssl")
public class RestConfig {}
