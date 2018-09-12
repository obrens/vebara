package Pomocne;

import java.io.*;

public class IdGetter {
	public static String Putanja = "";
	public static int getId(String idKljuc){
		
		int id = -1;
		BufferedReader in = null;
		try {
			File file = new File(Putanja + "/podaci/ids.txt");
			in = new BufferedReader(new FileReader(file));
			
			StringBuilder sb = new StringBuilder();
			String linija = in.readLine();
			while (linija != null){
				String[] reci = linija.split(" ");
				if (reci[0].equals(idKljuc)){
					id = Integer.parseInt(reci[1]);
					id++;
					linija = reci[0] + " " + id;
				}
				sb.append(linija);
				sb.append(System.lineSeparator());
				linija = in.readLine();
			}
			if (id == -1){
				id = 0;
				sb.append(idKljuc).append(" ").append(id);
				sb.append(System.lineSeparator());
			}
			
			BufferedWriter out = new BufferedWriter(new FileWriter(file, false));
			out.write(sb.toString());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (in != null)
				try {
					in.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
		}
		return id;
	}
}
