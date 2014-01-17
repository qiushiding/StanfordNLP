import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.ling.HasWord;
import edu.stanford.nlp.process.CoreLabelTokenFactory;
import edu.stanford.nlp.process.DocumentPreprocessor;
import edu.stanford.nlp.process.PTBTokenizer;

public class SentenceDetection {

	public static void main(String[] args) throws IOException {

		String str = "F:\\百度云\\Eclipse_workspace\\FudanNLPSrc\\TestData\\SentenceDetectionTest";
		DocumentPreprocessor dp = new DocumentPreprocessor(str);
		for (List sentence : dp) {
			System.out.println(sentence);
			
			for(Object word : sentence) {
				System.out.print(word + " ");
			}
			
			System.out.println();
		}

		// PTBTokenizer ptbt = new PTBTokenizer(new FileReader(str),
		// new CoreLabelTokenFactory(), "");
		// for (CoreLabel label; ptbt.hasNext();) {
		// label = (CoreLabel) ptbt.next();
		// System.out.println(label);
		// }
	}
}
