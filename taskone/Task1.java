package by.http.string.taskone;

//�  ������ ����� ������ 3-� ����� �������� �������� �������� 'Z'. ���� k ������ ����� �����, ������������� �� ���������.
public class Task1 {

	private String str;

	public Task1(String str) {
		this.str = str;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public String replStr() {
		String[] result = str.split(" ");
		String startVal = "";
		for (int i = 0; i < result.length; i++) {
			if (result[i].length() >= 3) {
				char[] myStrChar = result[i].toCharArray();
				myStrChar[2] = 'Z';
				result[i] = new String(myStrChar);

			}

		}
		for (String eachVal : result) {
			startVal += eachVal + " ";
		}
		System.out.println(startVal);
		return startVal;
	}

}