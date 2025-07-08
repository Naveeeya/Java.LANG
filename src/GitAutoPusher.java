import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GitAutoPusher {
    public static void main(String[] args) {
        try {
            // 🔧 Change this to the path of your local Java.LANG repo
            File repoDir = new File("C:/Users/Tarun Sagar/IdeaProjects/Java.LANG");

            // 1. Stage all changes
            runCommand("git add .", repoDir);

            // 2. Commit with timestamp message
            String timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
            String commitMsg = "Auto commit on " + timestamp;
            runCommand("git commit -m \"" + commitMsg + "\"", repoDir);

            // 3. Push to GitHub
            runCommand("git push", repoDir);

            System.out.println("✅ Auto push completed successfully.");
        } catch (Exception e) {
            System.err.println("❌ Error during Git operation:");
            e.printStackTrace();
        }
    }

    // Method to run git commands
    private static void runCommand(String command, File directory) throws IOException, InterruptedException {
        ProcessBuilder builder = new ProcessBuilder("cmd.exe", "/c", command);
        builder.directory(directory);
        builder.redirectErrorStream(true);
        Process process = builder.start();

        // Show output
        BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();
        int exitCode = process.waitFor();
        if (exitCode != 0) {
            throw new RuntimeException("Command failed with exit code: " + exitCode);
        }
    }
}
