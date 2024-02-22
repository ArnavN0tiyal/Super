package Super;

import java.io.IOException;

public class external {
        static final Runtime run = Runtime.getRuntime();
        static Process proc;
        public void $shutdown() throws IOException {
            proc = run.exec(new String[]{"cmd","/C","Start","shutdown", "/s"});
        }
         public void $dir() throws IOException {
            proc = run.exec(new String[]{"cmd","/C","Start","dir"});
         }
         public void $run(String runProgram) throws IOException {
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
                case "$CURSOR":
                proc = run.exec(new String[]{"cmd","/K","cursor"});
                break;
                case "$EXPLORER":
                proc = run.exec(new String[]{"cmd","/K","explorer"});
                break;
                case "$NOTEPAD":
                proc = run.exec(new String[]{"cmd","/K","notepad"});
                break;
                default:
                System.out.println("ERROR! Program not recognized, use [$EDGE, $CMD, $CALC, $CODE, $CURSOR, $EXPLORER, $NOTEPAD]");
            }
         }
}
