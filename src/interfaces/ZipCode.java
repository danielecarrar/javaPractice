package interfaces;

public class ZipCode {

	private String zipCode;

	public String getZipCode() {
		return zipCode;
	}

	public boolean setZipCode(String zipCode) {
		if (zipCode.length() > 5) {
			System.out.println("Too Long zipCode! Check!");
			return false;
		} else if (zipCode.length() < 5) {
			System.out.println("Too Short zipCode! Check!");
			return false;
		} else {
			this.zipCode = zipCode;
			return true;
		}
	}

}
