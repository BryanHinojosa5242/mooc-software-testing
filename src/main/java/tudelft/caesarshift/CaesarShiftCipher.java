package tudelft.caesarshift;

public class CaesarShiftCipher {

    public String CaesarShiftCipher(String message, int shift){
        if (message == null) return "invalid";

        StringBuilder sb = new StringBuilder();
        shift = shift % 26; // Asegurar que el desplazamiento esté dentro del rango

        for (char currentChar : message.toCharArray()) {
            if (currentChar < 'a' || currentChar > 'z') {
                return "invalid"; // Si hay un carácter no válido, devolver "invalid"
            }

            char newChar = (char) (currentChar + shift);

            // Ajustar si sale del rango de 'a' a 'z'
            if (newChar > 'z') {
                newChar = (char) (newChar - 26);
            } else if (newChar < 'a') {
                newChar = (char) (newChar + 26);
            }

            sb.append(newChar);
        }

        return sb.toString();
    }
}

