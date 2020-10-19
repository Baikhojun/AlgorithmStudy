class Solution {
    public String solution(String s, int n) {
        int len = s.length();
		char[] ch = new char[len];

		for (int i = 0; i < len; i++) {
			int num = (int) s.charAt(i);
			// ฐ๘น้
			if (num == 32) {
				ch[i] = s.charAt(i);
			}
			// 65~90 : A~Z
			if (num >= 65 && num <= 90) {
				int num1 = num + n;
				if (num1 >= 91) {
					ch[i] = (char) (num1 - 26);
				} else {
					ch[i] = (char) num1;
				}
			}
			// 97~122 : a~z
			if (num >= 97 && num <= 122) {
				int num2 = num + n;
				if (num2 >= 123) {
					ch[i] = (char) (num2 - 26);
				} else {
					ch[i] = (char) num2;
				}
			}
		}

		String answer = new String(ch);
        return answer;
    }
}