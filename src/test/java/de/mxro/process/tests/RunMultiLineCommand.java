package de.mxro.process.tests;

import org.junit.Test;

import de.mxro.process.Spawn;

public class RunMultiLineCommand {

    @Test
    public void test() {
        if (Spawn.isWindows()) {
            System.out.println("Test cannot run on Windows.");
            return;
        }
    }

}
