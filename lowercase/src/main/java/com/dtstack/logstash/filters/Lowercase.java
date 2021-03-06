package com.dtstack.logstash.filters;

import java.util.List;
import java.util.Map;
import com.dtstack.logstash.annotation.Required;

/**
 * 
 * Reason: TODO ADD REASON(可选)
 * Date: 2016年8月31日 下午1:54:14
 * Company: www.dtstack.com
 * @author sishu.yss
 *
 */
public class Lowercase extends BaseFilter {
	public Lowercase(Map config) {
		super(config);
	}

	@Required(required=true)
	private List<String> fields;

	public void prepare() {
	}

	@Override
	protected Map filter(Map event) {
		for (String field : fields) {
			if (event.containsKey(field)) {
				event.put(field, ((String) event.get(field)).toLowerCase());
			}
		}
		return event;
	}
}
