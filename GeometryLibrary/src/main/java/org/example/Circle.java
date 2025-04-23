package org.example;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

@Mojo(name = "circle")
public class Circle extends AbstractMojo {
    @Parameter(property = "a", defaultValue = "1")
    private float a;
    @Parameter(property = "b", defaultValue = "1")
    private float b;
    @Parameter(property = "r", defaultValue = "1")
    private float r;

    public void execute() throws MojoExecutionException, MojoFailureException {
        float circleArea = a * (b * b);
        System.out.println("Circle area = " + circleArea);
        System.out.println("Circle area = " + circleArea);

        double circlePerimiter = 2 * Math.PI * r;
        System.out.println("Circle perimiter = " + circlePerimiter);
    }
    public void SSS(){
        System.out.println("QQQQQQQ");
    }
}
