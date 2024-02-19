package Super;

import java.io.IOException;

public class external {
        static final Runtime run = Runtime.getRuntime();
        static Process proc;
        public void $Shutdown() throws IOException {
            proc = run.exec(new String[]{"cmd","/C","Start","shutdown", "/s"});
        }
         public void $Dir() throws IOException {
            proc = run.exec(new String[]{"cmd","/C","Start","dir"});
         }
         public void $Run(String runProgram) throws IOException {
            switch(runProgram) {
                case "$EDGE":
                    proc = run.exec(new String[]{"C:\\Program Files (x86)\\Microsoft\\Edge\\Application\\msedge.exe"});
                break;
                case "$CMD":
                proc = run.exec(new String[]{"cmd","/C","Start","Super Prompt"});
                case "$CALC":
                proc = run.exec(new String[]{"calc","/C","Start"});
                break;
                case "$CODE":
                proc = run.exec(new String[]{"cmd","/K","code"});
                break;
                default:
                System.out.println("ERROR! Program not recognized, use [$EDGE, $CMD, $CALC, $CODE]");
            }
         }
}
