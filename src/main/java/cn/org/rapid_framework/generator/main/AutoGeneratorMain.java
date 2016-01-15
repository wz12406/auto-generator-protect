package cn.org.rapid_framework.generator.main;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cn.org.rapid_framework.generator.GeneratorFacade;
import cn.org.rapid_framework.generator.GeneratorProperties;

/**
 * 运行main()自动生成 dao、service、model、mapper.xml
 * 
 * @version : Ver 1.0
 * @author : <a href="mailto:hubo@95190.com">hubo</a>
 * @date : 2015-5-28 下午10:35:33
 */
public class AutoGeneratorMain {
	protected static final Logger  logger = LoggerFactory.getLogger(AutoGeneratorMain.class);  
	private final static GeneratorFacade g = new GeneratorFacade();

	/**
	 * 生成数组中所有表名对应的
	 * 
	 * @param tableNames
	 *            表名数组
	 * @throws Exception
	 */
	public static void generateByTable(String... tableNames) throws Exception {
		if (null != tableNames && tableNames.length > 0) {
			for (String tbname : tableNames) {
				g.generateByTable(tbname, "template");
			}
		}
		logger.error("123456");
	}

	public static void main(String[] args) throws Exception {
		
		//sql server下生成所有表有bug,用下面sql查询出所有表，copy到下面数据中批量生成
//		SELECT STUFF((select ',"' + name +'"' from sysobjects where xtype='u' for xml path('')),1,1,'')
		// 1.生成数组中所有表名对应的
		String tablesStr = GeneratorProperties.getRequiredProperty("tables");
		String[] tableNames =  tablesStr.split(",");
		generateByTable(tableNames);
		// 打开文件夹
		Runtime.getRuntime().exec("cmd.exe /c start "+ GeneratorProperties.getRequiredProperty("outRoot"));
	}
}
