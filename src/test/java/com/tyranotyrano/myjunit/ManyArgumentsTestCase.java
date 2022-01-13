package com.tyranotyrano.myjunit;

public class ManyArgumentsTestCase extends TestCase {
    private static final String SPACE = " ";

    public ManyArgumentsTestCase(String testCaseName) {
        super(testCaseName);
    }

    public void runTestWithArgs(String s1, String s2, String s3) {
        System.out.println("ArgumentTestCase 테스트 성공!");

        StringBuilder builder = new StringBuilder();
        builder.append(s1);
        builder.append(SPACE);
        builder.append(s2);
        builder.append(SPACE);
        builder.append(s3);

        System.out.println("args : " + builder);
    }
}
