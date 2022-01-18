package stringbufferbuilder;

public class bufbuild {

	public static void main(String[] args) {
		String str="Beautiful";
		StringBuffer sBuffer=new StringBuffer("String to StringBuffer");
		sBuffer.append("Conversion");
		System.out.println(sBuffer);
				StringBuilder sb = new StringBuilder(str);
             sb.append(" world");
             System.out.println("String to StringBuilder");
             System.out.println(sb);
	}

}
