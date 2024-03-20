package exercism;

public class Acronym {

	String phrase;

	Acronym(String phrase) {
		this.phrase = phrase.toUpperCase();
	}

	String get() {

		if (phrase.length() == 0)
			return phrase;

		String acronym = "" + phrase.charAt(0);
		short i = 1;
		while (i < phrase.length() - 1) {
			if (phrase.charAt(i) == '-' || phrase.charAt(i) == ' ') {
				i++;
				while (i < phrase.length() - 1) {
					if (Character.isLetter(phrase.charAt(i))) {
						acronym += phrase.charAt(i);
						break;
					} else
						i++;
				}
			}
			i++;
		}
		return acronym;
	}

}