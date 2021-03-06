package userinfo.utils;


import org.apache.commons.lang.StringUtils;

public class URLUtils {
	public static String getEnpointService(String target) {
		String enpointService = EndPointReader.getInstance().getConfig(GWSConstants.CONFIG_KEY.ENPOINT_SERVICE_URL);
		if (StringUtils.endsWith(enpointService, GWSConstants.SLASH)) {
			return enpointService + target;
		}
		return enpointService + GWSConstants.SLASH + target;
	}
}
