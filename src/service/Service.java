package service;

import core.mappers.Mapper;

public class Service {


    public static String checkPassword(String generatedPassword){
        StringBuilder normalPassword = new StringBuilder();
        int i = 0;
        while (i < generatedPassword.length()) {
            boolean found = false;
            for (String key : Mapper.reverseMappings.keySet()) {
                if (generatedPassword.startsWith(key, i)) {
                    normalPassword.append(Mapper.reverseMappings.get(key));
                    i += key.length();
                    found = true;
                    break;
                }
            }
            if (!found) {
                normalPassword.append(generatedPassword.charAt(i));
                i++;
            }
        }

        return normalPassword.toString();
    }

    public static String generatePassword(String normalPassword){
        StringBuilder generatedPassword = new StringBuilder();


        for (char c : normalPassword.toCharArray()) {
            if (Mapper.specialMappings.containsKey(c)) {
                generatedPassword.append(Mapper.specialMappings.get(c));
            }
        }
        return generatedPassword.toString();
    }
}
