import core.cmd.CmdSetting;
import core.rules.SystemRules;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args){
        CmdSetting.supportTrChars();
        SystemRules.transactionContinuity();
    }
}