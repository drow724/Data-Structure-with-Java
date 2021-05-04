package chap02;

class PhysicalExaminationEx_02_10 {
	static final int VMAX = 21; // �떆�젰�쓽 遺꾪룷 (0.0遺��꽣 0.1 �떒�쐞濡� 21媛�)

	static class PhyscData {
		String name; // �씠由�
		int height; // �궎
		double vision; // �떆�젰

		// �깮�꽦�옄
		PhyscData(String name, int height, double vision) {
			this.name = name;
			this.height = height;
			this.vision = vision;
		}
	}

	// �궎�쓽 �룊洹좉컪�쓣 援ы빀�땲�떎.
	static double aveHeight(PhyscData[] dat) {
		double sum = 0;

		for (int i = 0; i < dat.length; i++)
			sum += dat[i].height;

		return sum / dat.length;
	}

	// �떆�젰�쓽 遺꾪룷瑜� 援ы빀�땲�떎.
	static void distVision(PhyscData[] dat, int[] dist) {
		int i = 0;

		dist[i] = 0;
		for (i = 0; i < dat.length; i++)
			if (dat[i].vision >= 0.0 && dat[i].vision <= VMAX / 10.0)
				dist[(int) (dat[i].vision * 10)]++;
	}

	public static void main(String[] args) {
		PhyscData[] x = { new PhyscData("�씠�굹�졊", 162, 0.3), new PhyscData("�쟾�꽌�쁽", 173, 0.7),
				new PhyscData("�씠�닔誘�", 175, 2.0), new PhyscData("�솉以�湲�", 171, 1.5), new PhyscData("�쑀吏��썕", 168, 1.2),
				new PhyscData("�씠�샇�뿰", 174, 1.2), new PhyscData("源��븳寃�", 169, 0.8), };
		int[] vdist = new int[VMAX]; // �떆�젰�쓽 遺꾪룷

		System.out.println("�뼚 �떊泥닿��궗 由ъ뒪�듃 �뼚");
		System.out.println(" �씠由�      �궎      �떆�젰");
		System.out.println("--------------");
		for (int i = 0; i < x.length; i++)
			System.out.printf("%-8s%3d%5.1f\n", x[i].name, x[i].height, x[i].vision);

		System.out.printf("\n�룊洹좏궎竊�%5.1fcm\n", aveHeight(x));

		distVision(x, vdist); // �떆�젰�쓽 遺꾪룷瑜� 援ы빀�땲�떎.

		System.out.println("\n�떆�젰�쓽 遺꾪룷");
		for (int i = 0; i < VMAX; i++) {
			System.out.printf("%3.1f~竊�", i / 10.0);
			for (int j = 0; j < vdist[i]; j++)
				System.out.print('*');
			System.out.println();
		}
	}
}
