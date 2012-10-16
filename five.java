public class ClientFormLogin {
	private static String getString(SortedMap<String, String> sortedMap) {
		StringBuilder sb = new StringBuilder();
		Iterator<Map.Entry<String, String>> iterator = sortedMap.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<String, String> e = iterator.next();
			sb.append(e.getKey());
			sb.append("=");
			sb.append(e.getValue());
			if (iterator.hasNext()) {
				sb.append("&");
			}
		}
		return sb.toString();
	}
}