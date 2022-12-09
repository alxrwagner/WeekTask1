public class Main {
    public static void main(String[] args) {
        String[] roles = {
                "Городничий",
                "Аммос Федорович",
                "Артемий Филиппович",
                "Лука Лукич"
        };
        String[] textLines = {
                "Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
                "Аммос Федорович: Как ревизор?",
                "Артемий Филиппович: Как ревизор?",
                "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
                "Аммос Федорович: Вот те на!",
                "Артемий Филиппович: Вот не было заботы, так подай!",
                "Лука Лукич: Господи боже! еще и с секретным предписаньем!"
        };

        showScript(roles, textLines);
    }

    public static void showScript(String[] roles, String[] textlines) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < roles.length; i++) {

            sb.append(roles[i]).append(":\n");

            for (int j = 0; j < textlines.length; j++) {
                if (textlines[j].startsWith(roles[i])) {
                    sb.append(j + 1)
                            .append(")")
                            .append(textlines[j].substring(roles[i].length() + 1))
                            .append("\n");
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
