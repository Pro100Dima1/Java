package org.example;


import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.examplee.Utils;

public class Main {
    public static void main(String[] args) throws MojoExecutionException, MojoFailureException {
        System.out.println("Hello world!");
        Utils utils = new Utils();
        utils.execute();
    }
}