import java.io.*;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @description:
 * @author: liyaguang
 * @create: 2018-12-07 15:42
 **/
public class FileTest {

    static final Pattern uidPattern = Pattern.compile(".*begin send card im, from: (\\d+)");

    public static void main(String[] args) {
        read("/Users/liyaguang/Downloads/im-log-push-2/im_push_recall_facade.log.4");
    }


    public static void read(String filePath) {
        System.out.println("------first method-------");
        File file = new File(filePath);


        if (file.exists()) {
            InputStreamReader reader;
            BufferedReader br;
            try {
                reader = new InputStreamReader(new FileInputStream(file));
                br = new BufferedReader(reader);
                String lineContent;
                int i = 0;
                int j = 0;
                Set<String> uids = new LinkedHashSet<>(10000);
                while ((lineContent = br.readLine()) != null) {
                    j++;
                    System.out.println(j);
                    Matcher matcher = uidPattern.matcher(lineContent);
                    if (matcher.find()) {
                        uids.add(matcher.group(1));
                    }
                }

                for (String uid : uids) {
                    System.out.print(uid + ",");
                    i++;
                    if (i % 100 == 0) {
                        System.out.println();
                        System.out.println("=======" + i);
                    }
                }
                System.out.println("读取行数为：" + j + ",获取行数为：" + i);
                br.close();
                reader.close();
            } catch (FileNotFoundException e) {
                System.out.println("no this file");
                e.printStackTrace();
            } catch (IOException e) {
                System.out.println("io exception");
                e.printStackTrace();
            }
        }
    }
}
