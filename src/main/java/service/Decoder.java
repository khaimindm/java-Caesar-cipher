package service;

public class Decoder {

    public char decode(char processedCharacter, int k) {
        int positionUpperCase = 0;
        int positionLowerCase = 0;
        String decodedCharacter;

        String[] russianAlphabetUpperCase = {"А", "Б", "В", "Г", "Д", "Е", "Ё", "Ж", "З", "И", "Й", "К", "Л", "М", "Н",
                                             "О", "П", "Р", "С", "Т", "У", "Ф", "Х", "Ц", "Ч", "Ш", "Щ", "Ъ", "Ы", "Ь",
                                             "Э", "Ю", "Я"};

        String[] russianAlphabetLowerCase = {"а", "б", "в", "г", "д", "е", "ё", "ж", "з", "и", "й", "к", "л", "м", "н",
                                             "о", "п", "р", "с", "т", "у", "ф", "х", "ц", "ч", "ш", "щ", "ъ", "ы", "ь",
                                             "э", "ю", "я"};

        if (Character.isUpperCase(processedCharacter)) {
            while (!(Character.toString(processedCharacter).equals(russianAlphabetUpperCase[positionUpperCase])) &&
                   positionUpperCase < 32) {
                positionUpperCase++;
            }
            if ((positionUpperCase + k) <= 32) {
                decodedCharacter = russianAlphabetUpperCase[positionUpperCase + k];
            } else {
                decodedCharacter = russianAlphabetUpperCase[(positionUpperCase + k) - 33];
            }
        } else {
            while (!(Character.toString(processedCharacter).equals(russianAlphabetLowerCase[positionLowerCase])) &&
                   positionLowerCase < 32) {
                positionLowerCase++;
            }
            if ((positionLowerCase + k) <= 32) {
                decodedCharacter = russianAlphabetLowerCase[positionLowerCase + k];
            } else {
                decodedCharacter = russianAlphabetLowerCase[(positionLowerCase + k) - 33];
            }
        }

        return decodedCharacter.charAt(0);
    }
}
