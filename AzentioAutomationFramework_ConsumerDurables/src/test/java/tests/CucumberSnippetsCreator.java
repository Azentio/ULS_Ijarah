package tests;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class CucumberSnippetsCreator {

	public static void main(String[] args) throws IOException {
		String getFilePath = System.getProperty("user.dir") + "\\FeatureSteps\\featureStepsIn";
		String outFilePath = System.getProperty("user.dir") + "\\FeatureSteps\\featureStepsOut";
		File outFile = new File(outFilePath);
		FileWriter fr = new FileWriter(outFile);
		List<String> listOfFileLines = Files.readAllLines(Path.of(getFilePath));

		if (listOfFileLines.size() == 0) {
			System.err.println("There is no content in the feature file");
		} else {
			for (String string : listOfFileLines) {
				string = string.trim();
				String[] splitGherkinKeyword = string.split(" ");
				int length = splitGherkinKeyword[0].length();
				String subString = string.substring(length);
				if ((splitGherkinKeyword[0].trim()).equals("And") || (splitGherkinKeyword[0].trim()).equals("Then")
						|| (splitGherkinKeyword[0].trim()).equals("When")
						|| (splitGherkinKeyword[0].trim()).equals("Given")
						|| (splitGherkinKeyword[0].trim()).equals("But")) {
					String annotationRegEx = "@" + splitGherkinKeyword[0].trim() + "(\"^" + subString.trim() + "$\")";
					
					String featureFunction = "public void "
							+ (((subString.replaceAll("[^a-zA-Z0-9_ ]", "")).trim()).replace(" ", "_").trim()).toLowerCase() + "()throws Throwable{";
					fr.write(annotationRegEx);
					fr.write("\n");
					fr.write(featureFunction);
					fr.write("\n");
					fr.write("}");
					fr.write("\n");
				} else {

					System.err.println(splitGherkinKeyword[0].trim() + " is not a valid gherkin keyword "+"Line number is "+(listOfFileLines.indexOf(string)+1));
				}
			}
			fr.close();
		}
	}
}