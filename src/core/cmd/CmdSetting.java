package core.cmd;

public class CmdSetting {

    public static void supportTrChars(){
        try {
            Process p = Runtime.getRuntime().exec("cmd /c chcp 65001");
            p.waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
