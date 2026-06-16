package Strings;
class DefangingAnIpAddress {
    public String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < address.length(); i++) {
            char ch = address.charAt(i);
            if (ch == '.') {
                sb.append("[.]");
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
//     public static void main(String[] args) {
//         DefangingAnIpAddress sol = new DefangingAnIpAddress();
//         String res = sol.defangIPaddr("1.11.1.1...1..31..1.4.4.1.41.4.141..");
//         System.out.println(res);
//     }
}
