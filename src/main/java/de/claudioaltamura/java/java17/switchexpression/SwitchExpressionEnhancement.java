package de.claudioaltamura.java.java17.switchexpression;

class SwitchExpressionEnhancement {

    String day(String day) {
        return switch (day) {
            case "M", "W", "F" -> "MWF";
            case "T", "TH", "S" -> "TTS";
            default -> {
                if(day.isEmpty())
                    yield "Please insert a valid day.";
                else
                    yield "Looks like a Sunday.";
            }
        };
    }

}