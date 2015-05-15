package iie.ihadoop.model;

/**
 * UDF实体类，对于业务表：udf
 * 
 * @author mashaolong
 * 
 */

public class Udf {

	public static final String[] SYS_FUNCTIONS = { "!", "!=", "%", "&", "*",
			"+", "-", "/", "<", "<=", "<=>", "<>", "=", "==", ">", ">=", "^",
			"abs", "acos", "and", "array", "array_contains", "ascii", "asin",
			"assert_true", "atan", "avg", "base64", "between", "bin", "case",
			"ceil", "ceiling", "coalesce", "collect_list", "collect_set",
			"compute_stats", "concat", "concat_ws", "context_ngrams", "conv",
			"corr", "cos", "count", "covar_pop", "covar_samp", "create_union",
			"cume_dist", "current_database", "date_add", "date_sub",
			"datediff", "day", "dayofmonth", "decode", "degrees", "dense_rank",
			"div", "e", "elt", "encode", "ewah_bitmap", "ewah_bitmap_and",
			"ewah_bitmap_empty", "ewah_bitmap_or", "exp", "explode", "field",
			"find_in_set", "first_value", "floor", "format_number",
			"from_unixtime", "from_utc_timestamp", "get_json_object", "hash",
			"hex", "histogram_numeric", "hour", "if", "in", "in_file", "index",
			"inline", "instr", "isnotnull", "isnull", "java_method",
			"json_tuple", "lag", "last_value", "lcase", "lead", "length",
			"like", "ln", "locate", "log", "log10", "log2", "lower", "lpad",
			"ltrim", "map", "map_keys", "map_values", "matchpath", "max",
			"min", "minute", "month", "named_struct", "negative", "ngrams",
			"noop", "noopwithmap", "not", "ntile", "nvl", "or", "parse_url",
			"parse_url_tuple", "percent_rank", "percentile",
			"percentile_approx", "pi", "pmod", "posexplode", "positive", "pow",
			"power", "printf", "radians", "rand", "rank", "reflect",
			"reflect2", "regexp", "regexp_extract", "regexp_replace", "repeat",
			"reverse", "rlike", "round", "row_number", "rpad", "rtrim",
			"second", "sentences", "sign", "sin", "size", "sort_array",
			"space", "split", "sqrt", "stack", "std", "stddev", "stddev_pop",
			"stddev_samp", "str_to_map", "struct", "substr", "substring",
			"sum", "tan", "to_date", "to_unix_timestamp", "to_utc_timestamp",
			"translate", "trim", "ucase", "unbase64", "unhex",
			"unix_timestamp", "upper", "var_pop", "var_samp", "variance",
			"weekofyear", "when", "windowingtablefunction", "xpath",
			"xpath_boolean", "xpath_double", "xpath_float", "xpath_int",
			"xpath_long", "xpath_number", "xpath_short", "xpath_string",
			"year", "|", "~", "default" };

	public String udfname;// udf函数名称，不包含default前缀
	public String classname;// udf实现类名，例如：com.udf.UdfTest
	public String jarname;// jar文件名， 例如：UdfTest.jar
	public String descriptor;// udf的描述信息
	public String author;// udf的作者信息
	public String registertime;// udf的注册时间

	public String getUdfname() {
		return udfname;
	}

	public void setUdfname(String udfname) {
		this.udfname = udfname;
	}

	public String getClassname() {
		return classname;
	}

	public void setClassname(String classname) {
		this.classname = classname;
	}

	public String getjarname() {
		return jarname;
	}

	public void setjarname(String jarname) {
		this.jarname = jarname;
	}

	public String getDescriptor() {
		return descriptor;
	}

	public void setDescriptor(String descriptor) {
		this.descriptor = descriptor;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getRegistertime() {
		return registertime;
	}

	public void setRegistertime(String registertime) {
		this.registertime = registertime;
	}

}
