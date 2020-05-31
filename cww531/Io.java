package cww531;
import org.junit.Test;

import java.io.*;

public class Io {
    @Test
    public void t1() throws IOException {
        FileOutputStream fos = new FileOutputStream("");   //覆盖
//        PrintWriter pw = new PrintWriter(fos，true); //按行输出字符串
          PrintWriter pw = new PrintWriter(fos);
          OutputStreamWriter osw = new OutputStreamWriter(fos);
        BufferedWriter bf = new BufferedWriter(osw);
        bf.write("追加1");
        bf.newLine();
        pw.print("追加1");
        pw.print("追加2");
        pw.print("追加3");
        pw.print("追加4");
        pw.flush();//手动刷新缓存区
    }

}
