package userinfo.utils;


import java.util.Collection;
import java.util.Map;

import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.StringUtils;


public class DataUtils {
	public static boolean isEmpty(Collection<?> list) {
		return list == null || list.isEmpty();
	}

	public static boolean isNotEmpty(Collection<?> list) {
		return !isEmpty(list);
	}

	public static int getSize(Collection<?> list) {
		return isEmpty(list) ? 0 : list.size();
	}

	public static boolean isActive(String status) {
		return StringUtils.equals(status, GWSConstants.FLAG.Y);
	}

	public static Object getByIndex(Object[] array, int index) {
		int len = ArrayUtils.getLength(array);
		if (index <= (len - 1)) {
			return array[index];
		}
		return null;
	}
		
	public static boolean isNotBlankValue(Object object) {
		return !isBlankValue(object);
	}

	public static boolean isBlankValue(Object object) {

		boolean isBlankValue = true;

		if (object != null) {
			if (object instanceof String) {
				String stringObject = (String) object;
				if (StringUtils.isNotEmpty(stringObject) && StringUtils.isNotBlank(stringObject) && stringObject.trim().length() > 0 && !StringUtils.equals(stringObject, "null") && !StringUtils.equalsIgnoreCase(stringObject, "nan")) {

					isBlankValue = false;
				}

			} else {
				isBlankValue = false;
			}
		}

		return isBlankValue;
	}

	@SuppressWarnings("rawtypes")
	public static void destroyObject(Object object) {
		if (object != null) {
			if (object instanceof Collection<?>) {
				((Collection) object).clear();
			} else if (object instanceof Map<?, ?>) {
				((Map) object).clear();
			}
			object = null;
		}
	}
}
