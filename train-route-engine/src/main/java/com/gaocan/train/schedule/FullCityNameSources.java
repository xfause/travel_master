package com.gaocan.train.schedule;

import java.util.Arrays;
import java.util.Collection;
import org.jpenguin.ICityNameSource;

public class FullCityNameSources implements ICityNameSource {
	public final static String[] cities = { "小金", "雅江", "新龙", "道孚", "金川", "壤塘",
			"越西", "理塘", "白玉", "茂县", "色达", "巴塘", "得荣", "大兴安岭", "峨边", "五华", "安福",
			"临城", "高邮", "红古区", "岱山", "龙州", "密山", "万载", "青州", "曲周", "镇江", "神农架",
			"开化", "平坝", "福鼎", "阳原", "上思", "延川", "易门", "临夏县", "香港", "连云港", "株洲",
			"株洲县", "宣城", "衢州", "汉中", "抚州", "荆州", "菏泽", "北戴河", "泰山", "南戴河",
			"千岛湖", "雁荡山", "西双版纳", "商洛", "台州", "淮北", "池州", "达州", "稻城", "九华山",
			"九寨沟", "黑水", "香格里拉", "亳州", "泸定", "周庄", "喀纳斯", "鄂尔多斯", "满洲里",
			"四姑娘山", "朔州", "嵊州", "彬县", "荣成", "上海", "北京", "成都", "武汉", "青岛", "迪庆",
			"峨眉山", "淮阴", "崇州", "彭州", "葫芦岛", "达川", "合川", "万县", "普兰店", "甘孜",
			"阿坝", "丹巴", "炉霍", "德格", "乡城", "石渠", "美姑", "红原", "若尔盖", "孝感", "唐山",
			"五寨", "文水", "澧县", "新乐", "紫金", "涞水", "湘潭", "拜泉", "英德", "盱眙", "户县",
			"马山", "崇义", "白银", "滕州", "灌云", "邓州", "济宁", "永年", "岫岩", "登封", "惠民",
			"凤山", "繁峙", "拉萨", "恩施", "荣昌", "马鞍山", "原阳", "兰坪", "围场", "太湖", "奉贤",
			"顺昌", "惠东", "木里", "九台", "镇康", "温宿", "蒙自", "永昌", "三明", "伽师", "乐都",
			"宜春", "城固", "隰县", "中宁", "咸丰", "遂川", "商丘县", "泸州", "南和", "德庆", "海口",
			"汉沽", "喀喇沁旗", "饶阳", "玉林", "胶州", "无为", "龙胜", "随州", "特克斯", "长清",
			"荔浦", "德清", "岚臬", "峨山", "加格达奇", "安泽", "绵阳", "辽阳", "衡东", "武功", "兴山",
			"潼关", "海阳", "单县", "鄂托克前旗", "威远", "墨江", "伊川", "珲春", "芷江", "诏安",
			"温州", "厦门", "花垣", "德安", "宁国", "环县", "歙县", "宜君", "尼木", "洪湖", "瓦房店",
			"土默特左", "洪雅", "常熟", "宜宾县", "永州", "大竹", "衢县", "昌江", "西平", "修水",
			"五大连池", "阳春", "濮阳", "营山", "江城", "长岭", "翁源", "天柱", "陇川", "辉南", "柘城",
			"滁州", "南宫", "大荔", "巴彦", "福泉", "芮城", "扎兰屯", "东乌珠穆沁旗", "漳平", "道县",
			"峡江", "镶黄旗", "崇信", "鲁甸", "鹤岗", "城口", "永新", "沁源", "海原", "正安", "涟源",
			"西峰", "博湖", "千阳", "新津", "横峰", "米易", "松阳", "清新", "驻马店", "礼县", "常宁",
			"邗江", "左旗", "中山", "巩留", "津市", "保山", "开江", "太和", "玛沁", "呼图壁", "元江",
			"献县", "宽城", "伊吾", "桃江", "宜昌县", "息县", "满城", "喀喇沁左翼", "南阳县", "东胜",
			"汉源", "思茅", "郴州", "临潭", "顺义", "双鸭山", "揭阳", "椒江", "泊头", "阳曲", "闽清",
			"荏平", "城步", "义马", "双峰", "安仁", "灵壁", "灵山", "弥勒", "浑源", "德化", "通化",
			"平罗", "阳新", "泸水", "简阳", "射阳", "梅县", "昌黎", "绥德", "忻州", "开鲁", "雅安",
			"南昌", "哈尔滨", "香河", "桓曲", "大方", "宁南", "通河", "西林", "于都", "内乡", "辽阳县",
			"六枝", "吐鲁番", "土默特右旗", "金坛", "乐亭", "黎城", "金溪", "芒康", "清苑", "龙川",
			"苏州", "大足", "柘荣", "云龙", "怀安", "东港", "梨树", "顿昌", "河南", "皮山", "东宁",
			"苍溪", "龙羊峡", "岑溪", "桐庐", "肃宁", "同德", "巴马", "海安", "甘谷", "右玉", "沈丘",
			"黄陂", "周至", "荥经", "榆社", "灌阳", "浦城", "宜恩", "禄丰", "江浦", "宁明", "惠阳",
			"石嘴山区", "禹州", "新晃", "铜陵", "镇宁", "潜山", "兴平", "奎屯", "江油", "于田", "永德",
			"合山", "金山", "化德", "郯城", "抚松", "剑阁", "萍乡", "安平", "克山", "宜昌", "三亚",
			"海东", "疏勒", "宜城", "平邑", "叶城", "梧州", "冷水江", "铜陵县", "双城", "汪清", "岐山",
			"柏乡", "万安", "马龙", "新野", "荣县", "三江", "番禺", "腾冲", "紫阳", "米泉", "吉安县",
			"鸡泽", "鹿寨", "永安", "新蔡", "清水河", "博白", "郁南", "嘉鱼", "兰州", "昌邑", "利辛",
			"济源", "黄骅", "万源", "镇海", "新河", "维西", "介休", "凤台", "湖口", "始兴", "江永",
			"监利", "邛崃", "隆尧", "阿荣旗", "垦利", "容县", "泾川", "安阳", "高明", "镇雄", "奈曼旗",
			"宁冈", "西马珠穆沁旗", "兖州", "郾城", "扎囊", "盘锦", "扬州", "高县", "瓯海", "闽候",
			"武平", "凤冈", "石台", "涪陵", "大埔", "双辽", "芜湖", "塘沽", "新民", "东阿", "五常",
			"乾安", "宁晋", "新巴尔虎右旗", "武川", "商丘", "耀县", "海兴", "金口河", "和县", "成武",
			"蓬安", "孟连", "剑川", "临高", "祁东", "石柱", "锦屏", "安吉", "南漳", "平凉", "察布查尔",
			"长子", "石门", "行唐", "古丈", "绍兴", "铜鼓", "孟县", "苍梧", "汝阳", "泉州", "泰兴",
			"东海", "乳山", "易县", "防城", "沧州", "代县", "庐山", "保康", "盐边", "常山", "濉溪",
			"盖州", "辉县", "绿春", "拜城", "黔西", "南县", "南涧", "卓尼", "吴忠", "白沙", "靖远",
			"揭东", "玉环", "晋城", "永丰", "新平", "黄冈", "民乐", "固阳", "淮阴县", "佳木斯", "汝城",
			"湘乡", "鸡东", "德钦", "高州", "鹿邑", "鹤山", "东台", "青神", "巫溪", "威海", "兴国",
			"卢氏", "哈密", "丰润", "康定", "花都", "泗县", "田阳", "长汀", "张家港", "南城", "顺平",
			"兴隆", "江达", "垣曲", "重庆", "临沐", "万全", "宽甸", "滦川", "永平", "周宁", "寻甸",
			"儋州县", "鹤壁", "南康", "建德", "犍为", "内丘", "神池", "丰顺", "广德", "安阳县", "祁阳",
			"即墨", "乌拉特前旗", "固始", "呼和浩特", "肥城", "子长", "临夏", "安义", "湟中", "舟曲",
			"广州", "古县", "海林", "白山", "榆林", "木兰", "衡南", "宣汉", "肇东", "凭祥", "宝坻",
			"巢湖", "台江", "洪泽", "独山", "元谋", "牟定", "和龙", "宁陕", "凤凰", "泰顺", "马关",
			"宜丰", "河间", "鸡西", "肇庆", "孝义", "宁都", "耿马", "东平", "彰武", "武安", "旺苍",
			"阿图什", "乌兰", "松江", "定西", "克拉马依", "桐梓", "贺县", "邵阳", "永嘉", "旬阳",
			"合肥", "潮州", "元阳", "佛冈", "桑植", "沐川", "宜川", "靖安", "郎溪", "徐州", "丘县",
			"遂昌", "正阳", "徽县", "瓮安", "逊克", "和静", "戈阳", "惠农", "平遥", "永济", "巨野",
			"郧县", "普格", "蒲县", "平谷", "巴里坤", "溧阳", "滦县", "离石", "泸西", "合阳", "乐至",
			"莆田", "潼南", "绥宁", "慈溪", "蒲圻", "万山", "平阴", "海拉尔", "都安", "罗山", "故城",
			"寿县", "当阳", "建昌", "瑞金", "赫章", "修文", "扶沟", "昌乐", "临海", "长乐", "都昌",
			"伊犁", "轮台", "霍林郭勒", "临澧", "威信", "新会", "三原", "正宁", "广元", "宝鸡县",
			"黎川", "巴青", "郧西", "新乡", "丰都", "应城", "民和", "娄底", "平乡", "高平", "元氏",
			"含山", "桐乡", "西盟", "邹城", "英吉沙", "黑河", "洛川", "辽中", "信丰", "文安", "杭州",
			"新昌", "德惠", "琼海", "伊敏河", "友谊", "泗洪", "滨海", "积石山", "甘洛", "文登", "合浦",
			"盐亭", "临汾", "衡阳县", "高台", "梅河口", "通县", "宕昌", "尼勒克", "格尔木", "安国",
			"江陵", "江津", "乌拉特后旗", "罗城", "冀州", "全州", "突泉", "静乐", "海城", "松溪",
			"泗水", "临泉", "都兰", "牡丹江", "灵宝", "资兴", "云和", "临洮", "灵武", "集贤", "枣庄",
			"龙里", "承德", "沁水", "肃南", "清镇", "肇源", "临猗", "贵港", "渭南", "庐江", "和田",
			"吉水", "大兴", "类烦", "沅江", "武义", "阳西", "唐县", "冷水滩", "乌什", "利津", "陆丰",
			"临河", "普陀", "中甸", "东川", "承德县", "洛隆", "宁武", "界首", "庄浪", "大余", "遵义县",
			"赤水", "浠水", "新乡县", "阿拉善右旗", "河池", "长岛", "府谷", "临安", "宝应", "利川",
			"望奎", "昔阳", "内黄", "通榆", "当涂", "汝南", "靖州", "靖边", "徐闻", "通许", "宣化",
			"融安", "合水", "虞城", "畹町", "兴文", "武夷山", "桐柏", "昌都", "双流", "谷城", "镇巴",
			"上杭", "盐山", "洞口", "济南", "五峰", "泰和", "沙湾", "高碑店", "阳谷", "阿城", "阳山",
			"柳河", "稷山", "德保", "黄山", "青川", "贵德", "奉新", "富平", "阆中", "潮安", "长兴",
			"星子", "通道", "常州", "江门", "锦州", "龙山", "永和", "大洼", "金昌", "武都", "平利",
			"石城", "肥乡", "忠县", "勃利", "麻栗坡", "绥阳", "梁山", "兴宁", "乐东", "通江", "乐山",
			"新建", "陈巴尔虎", "宁城", "铅山", "北流", "南通县", "东兰", "静宁", "望江", "翁牛特旗",
			"襄汾", "洱源", "怀化", "二连浩特", "武昌县", "茂名", "双阳", "博爱", "莆田县", "壁山",
			"涡阳", "齐河", "铜山", "玛曲", "大化", "云浮", "玉田", "永城", "宜兴", "上饶", "浙川",
			"巫山", "蒲江", "东安", "淮阳", "永川", "吉林", "应县", "弥渡", "磐石", "韶山", "澄江",
			"晋县", "霍州", "阿里", "资中", "依安", "封邱", "古蔺", "名山", "隆德", "连城", "乳源",
			"大田", "仪陇", "五莲", "剑河", "宾县", "金华县", "靖宇", "洛阳", "华亭", "莘县",
			"和林格尔", "鼓泽", "苏尼特左旗", "岳普湖", "南通", "镇源", "兴华", "日照", "嵩县", "平川",
			"龙井", "斗门", "鄂托克旗", "阿瓦提", "任丘", "建始", "漾濞", "寿宁", "丹徒", "崇礼",
			"延长", "永靖", "喜德", "三门", "那曲", "宣威", "博野", "灵丘", "怀来", "宜州", "宁波",
			"高陵", "汾阳", "汩罗", "阜宁", "渑池", "桂东", "昭苏", "景泰", "马边", "霸州", "齐齐哈尔",
			"荣城", "淮安", "松滋", "北票", "玉树", "永仁", "朝阳", "信宜", "泸溪", "杭锦旗", "秦皇岛",
			"隆安", "东莞", "聊城", "三台", "平塘", "宁乡", "龙游", "正定", "大姚", "李家峡", "红安",
			"周口", "榆树", "广丰", "平阳", "仁寿", "尉犁", "遵化", "茶陵县", "宁蒗", "江阴", "安达",
			"长葛", "江川", "长春", "广灵", "资阳", "大港", "沧源", "浮山", "德江", "富川", "肇州",
			"上高", "融水", "潢川", "通城", "饶河", "青浦", "青阳", "宁阳", "老河口", "磁县", "衡山",
			"滑县", "华池", "佛坪", "台安", "资源", "永吉", "垫江", "政和", "仙桃", "台山", "石屏",
			"华阴", "新密", "万宁", "临泽", "洮南", "永定", "枝城", "枣强", "富阳", "南平", "井冈山",
			"塔什库尔干", "安岳", "繁昌", "岢岚", "天峻", "瑞丽", "曲阜", "霍邱", "桂林", "蕲春",
			"南召", "珙县", "彝良", "平定", "龙口", "乌海", "闻喜", "武岗", "平舆", "陇县", "蚌埠",
			"枝江", "广宗", "平南", "房山", "金堂", "扎鲁特旗", "吉首", "昌吉", "遂宁", "华坪", "什邡",
			"阿勒泰", "海伦", "钟山", "新绛", "鄞县", "化隆", "林县", "巴县", "清远", "淮滨", "西昌",
			"新巴尔虎", "玛纳斯", "罗定", "敖汉旗", "同心", "天峨", "怀宁", "澜沧", "费县", "镇平",
			"绥棱", "福清", "蓟县", "长沙", "孙吴", "西和", "堆龙德庆", "佛山", "孟村", "南江", "新洲",
			"会昌", "黄陵", "赣县", "沁阳", "迭部", "平泉", "仙游", "藁城", "西华", "平顺", "会泽",
			"双牌", "平果", "肥东", "云梦", "睢宁", "嫩江", "常德", "电白", "郓城", "八宿", "长垣",
			"望都", "鄂温克旗", "景宁", "九江", "禹城", "陶乐", "延吉", "龙南", "灵石", "遵义", "汉川",
			"三门峡", "定州", "天等", "龙海", "绥中", "贵定", "海丰", "松潘", "冷湖", "进贤", "古交",
			"南丰", "兰溪", "郫县", "固镇", "纳雍", "焉善", "扎赉特旗", "余干", "昆明", "阳城",
			"阿克塞", "延安", "永清", "西吉", "宝清", "东至", "定兴", "余江", "忻城", "息烽", "舒城",
			"大通", "东营", "洪江", "嘉定", "井陉", "汉寿", "沂水", "光泽", "凉城", "青县", "遂溪",
			"田东", "新邵", "黄岩", "东源", "邵武", "江安", "柯坪", "巴东", "丁青", "四会", "牟平",
			"雷波", "建湖", "公安", "苍南", "上蔡", "南部", "白水", "麻城", "石家庄", "汾西", "七台河",
			"临湘", "乌拉特中旗", "中牟", "临县", "蠡县", "富源", "宝丰", "营口", "洞头", "陵川",
			"蛟河", "上虞", "宁强", "青铜峡", "庆元", "玉山", "永登", "汕头", "康乐", "同安", "镇远",
			"张北", "涟水", "武邑", "攀枝花", "兴县", "新兴", "霍山", "靖西", "乐陵", "敦化", "夏河",
			"西畴", "启东", "丹东", "河曲", "廊坊", "婺源", "广平", "天水", "武进", "林芝", "略阳",
			"文成", "丹江口", "开平", "卫辉", "新泰", "会理", "遂平", "北海", "巴中", "定安", "山丹",
			"牙克石", "林口", "湖州", "兴安", "招远", "南川", "崇阳", "金平", "卓资", "东明", "赤城",
			"芜湖县", "横山", "南乐", "乐昌", "仁怀", "清源", "保亭", "额尔古纳", "索县", "临江",
			"吴旗", "汶上", "信阳", "奇台", "临漳", "呼兰", "桂平", "巴林左旗", "连南", "阿克苏",
			"武穴", "曲沃", "长泰", "高安", "且未", "东阳", "交城", "余杭", "金寨", "桂阳", "冠县",
			"龙陵", "大连", "朝阳县", "杞县", "前郭", "太原", "兴义", "张家界", "武鸣", "宜黄", "建水",
			"德都", "鄄城", "广饶", "南丹", "民权", "理县", "乌苏", "高唐", "祁门", "邵阳县", "南皮",
			"隆化", "庆阳", "长武", "蓬莱", "盐津", "西安", "林甸", "会宁", "溧水", "包头", "方城",
			"普洱", "井研", "乡宁", "安宁", "黄平", "湟源", "凌云", "太仆寺旗", "安顺", "正蓝旗",
			"海盐", "柞水", "洛宁", "肃北", "綦江", "沾化", "凤城", "汤阴", "墨玉", "新沂", "讷河",
			"砀山", "漳浦", "固原", "岳阳县", "铜川", "循化", "武定", "龙门", "大庆", "万荣",
			"伊金霍洛旗", "兰西", "巩义", "织金", "漳县", "全南", "景东", "庆云", "诸城", "陆河",
			"宁德", "四平", "靖江", "沙县", "昌平", "东乡", "迁西", "天镇", "新田", "高邑", "莎车",
			"仙居", "静海", "梁平", "襄垣", "左权", "太平", "义乌", "新余", "澄海", "赣州", "旌德",
			"涿州", "远安", "门源", "扶绥", "嵊县", "杭锦后旗", "抚远", "莱芜", "依兰", "尉氏",
			"德令哈", "成安", "桐城", "勉县", "银川", "枞阳", "陆良", "长宁", "珠海", "莒南", "海康",
			"天门", "响水", "石首", "农安", "大城", "广安", "祥云", "沙市", "新源", "温岭", "泰宁",
			"黄龙", "陵县", "灌南", "新宾", "琼中", "泗阳", "乐清", "岚县", "房县", "那坡", "延津",
			"石狮", "阜南", "安图", "盐池", "龙泉", "乌兰浩特", "高要", "高阳", "洁源", "来宾", "惠安",
			"方山", "莒县", "河源", "苏尼特右旗", "慈利", "汤原", "平昌", "交口", "张家口", "彭阳",
			"茶陵", "曲靖", "柳城", "威县", "都江堰", "大厂", "凤县", "平潭", "德州", "永胜", "淮南",
			"兴城", "潮阳", "景谷", "武隆", "茫崖", "夏邑", "个旧", "秦安", "仁布", "阿拉善左旗",
			"淄博", "上街", "托克托", "文昌", "庆安", "隆回", "武清", "柳州", "会东", "日喀则", "涿鹿",
			"满州里", "通山", "广宁", "绥江", "沅陵", "布拖", "舟山", "民勤", "清河", "凤翔", "镇赉",
			"穆棱", "富宁", "鞍山", "偏关", "木垒", "丰城", "新都", "比如", "丽水", "分宜", "栖霞",
			"勐腊", "恭城", "习水", "海门", "西充", "福安", "确山", "通渭", "漠河", "阜新", "攸县",
			"乐安", "眉县", "泾阳", "潞西", "平远", "延庆", "九江县", "清徐", "巴林右旗", "宝兴",
			"三水", "缙云", "运城", "合江", "宁海", "通海", "湘阴", "安陆", "怀远", "叶县", "邕宁",
			"台前", "江北", "徐水", "紫云", "廉江", "郑州", "丹阳", "巍山", "南宁", "屯留", "东光",
			"连山", "云霄", "昭通", "富县", "平乐", "宁陵", "彭山", "恩平", "开县", "黄梅", "沛县",
			"尚志", "阿克陶", "湛江", "富民", "颖上", "乐业", "保定", "桦南", "江宁", "桦甸", "广汉",
			"晋江", "西陕", "海晏", "盐源", "滦平", "益阳", "绥化", "西丰", "迁安", "沂源", "吴县",
			"姚安", "巩县", "环江", "阳高", "北碚", "麦盖提", "通辽", "咸阳", "滨州", "资溪", "桓仁",
			"灵川", "辛集", "蒙城", "横县", "三河", "郏县", "定南", "泾源", "鄢陵", "馆陶", "嵩明",
			"永兴", "丹凤", "武强", "臬兰", "崇明", "施秉", "漯河", "平度", "华安", "酒泉", "信阳县",
			"乌恰", "米脂", "鲁山", "神木", "碌曲", "三都", "瑞安", "乐平", "内江", "会同", "潞城",
			"饶平", "曲江", "武胜", "临颖", "石泉", "宁津", "梅州", "浏阳", "玉门", "莲花", "竹山",
			"贡嘎", "孟津", "川沙", "莱西", "建宁", "梁河", "原平", "崇左", "江山", "泰州", "柳江",
			"曲阳", "长治", "临沂", "长丰", "安塞", "无锡", "襄阳", "桃源", "博罗", "沙雅", "金阳",
			"和平", "浦北", "左云", "如皋", "京山", "永春", "贵溪", "寿阳", "六盘水", "富顺", "深圳",
			"宿迁", "武山", "邯郸", "获嘉", "安新", "岳西", "华宁", "嘉禾", "张家川", "喀什", "河津",
			"若羌", "宜阳", "威宁", "萧山", "全椒", "安县", "浚县", "公主岭", "开封县", "张掖", "泰来",
			"凯里", "连江", "宁县", "开封", "嘉祥", "大关", "集宁", "广南", "黟县", "永顺", "昆山",
			"宿州", "辰溪", "丽江", "泽当", "济阳", "临清", "集安", "新化", "怀集", "绩溪", "南充",
			"自贡", "十堰", "文县", "天祝", "长阳", "尼玛", "措勤", "增城", "务川", "克什克腾旗",
			"沙河", "嘉兴", "许昌县", "潍坊", "耒阳", "疏附", "永善", "淳安", "武宣", "凌源", "芦山",
			"沁县", "嘉荫", "永康", "红河", "五台", "祁县", "南海", "舞阳", "班戈", "澄迈", "库伦旗",
			"樟树", "昌宁", "夹江", "乌审", "黄石", "汕尾", "海宁", "宁化", "德阳", "侯马", "长寿",
			"天台", "沈阳", "岷县", "鹰潭", "镇安", "尖扎", "双江", "长安", "伊通", "赞皇", "安西",
			"叙永", "富裕", "古田", "唐海", "阿合奇", "蓝山", "象山", "广水", "扬中", "平江", "鹤峰",
			"修武", "正镶白旗", "安丘", "华蓥", "大理", "河口", "临潼", "蒙阴", "泾县", "东山", "天津",
			"榆中", "水富", "眉山", "临邑", "馨安", "景德镇", "汶川", "广河", "揭西", "呈贡", "大同",
			"高密", "丰宁", "邻水", "山阳", "宜章", "华容", "冕宁", "临桂", "南华", "筠连", "密云",
			"塑州", "康保", "隆昌", "盐城", "平原", "霍城", "同仁", "南安", "夏县", "青冈", "微山",
			"宾川", "宜良", "邹平", "上海县", "项城", "石嘴山", "灵寿", "昌图", "同江", "黎平", "博乐",
			"丰县", "两当", "唐河", "商城", "抚顺", "溆浦", "五原", "长白", "大柴旦", "甘南", "漳州",
			"鄂伦春", "深泽", "陵水", "昭平", "文山", "上饶县", "嘉善", "百色", "商都", "魏县", "新宁",
			"长海", "师宗", "黔江", "平和", "洋浦", "安化", "阜康", "图们", "温江", "宁安", "淇县",
			"寿光", "沐阳", "舒兰", "绥滨", "肥西", "竹溪", "汝州", "南溪", "庄河", "阳泉", "大冶",
			"磴口", "连平", "韩城", "大新", "惠州", "从江", "无极", "焦作", "宿松", "云县", "汉阴",
			"中卫", "上犹", "高青", "商河", "南京", "克东", "金乡", "阜平", "勐海", "东丰", "赤峰",
			"罗田", "玉溪", "平武", "乌鲁木齐", "郸城", "阜城", "武威", "邢台", "共和", "大宁", "赵县",
			"伊春", "天长", "绛县", "延寿", "曹县", "保靖", "黑山", "盘县", "巨鹿", "莱阳", "清水",
			"泌阳", "开远", "崇仁", "礼泉", "罗源", "永修", "阳东", "太康", "休宁", "桦川", "本溪",
			"阿巴嘎旗", "四子王旗", "射洪", "阳朔", "贡山", "南阳", "大安", "塔河", "刚察", "铁力",
			"云阳", "鱼台", "余姚", "绵竹", "和硕", "安庆", "宜宾", "钦洲", "建平", "天全", "福州",
			"泰安", "南陵", "丰镇", "金华", "巧家", "绍兴县", "秭归", "黔阳", "任县", "霞浦", "岳池",
			"麟游", "通化县", "南靖", "仁化", "蔚县", "吉木萨尔", "丘北", "雷山", "金湖", "玉屏",
			"安远", "开原", "商水", "贺兰", "江华", "醴陵", "抚宁", "双桥", "吴江", "化州", "博兴",
			"灵台", "大悟", "荥阳", "中阳", "仪征", "瑞昌", "龙江", "鄂州", "屏南", "达拉特旗", "偃师",
			"阳信", "楚雄", "荆门", "从化", "清流", "互助", "金塔", "库尔勒", "温县", "涞源", "南雄",
			"莫力达瓦", "大丰", "武城", "丰南", "田林", "宾阳", "定远", "宝鸡", "铜仁", "陇西",
			"嘉峪关", "万年", "虎林", "襄城", "临朐", "藤县", "铜梁", "定襄", "兴和", "盈江", "建瓯",
			"南汇", "锦西", "石阡", "莱州", "怀柔", "寻乌", "商南", "平顶山", "镇原", "安康", "吉安",
			"咸宁", "夏津", "准格尔旗", "吴川", "新丰", "临西", "渠县", "曲水", "钟祥", "容城", "雄县",
			"柳林", "江都", "贵阳", "南澳", "枣阳", "六安", "鄯善", "大名", "山南", "鹤庆", "屏边",
			"普宁", "赣榆", "绥芬河", "韶关", "舞钢", "昭觉", "诸暨", "临武", "和布克赛尔", "岳阳",
			"安乡", "义县", "沂南", "琼山", "胶南", "路南", "章丘", "龙岩", "景县", "蒙山", "洪洞",
			"许昌", "邵东", "康县", "清丰", "和顺", "永福", "襄樊", "来安", "麻阳", "保德", "如东",
			"来凤", "蕉岭", "武乡", "衡水", "青田", "封开", "铁岭", "光山", "根河", "象州", "罗平",
			"古浪", "烟台", "余庆", "宁河", "社旗", "新县", "屏山", "平陆", "奉化", "潜江", "新安",
			"怀仁", "滦南", "双柏", "北安", "林西", "志丹", "嵊泗", "敦煌", "通什", "普定", "无棣",
			"明水", "辽源", "衡阳", "大庸", "栾城", "松原", "惠水", "达尔罕茂明安", "锦县", "太谷",
			"西宁", "大邑", "太仓", "奉节", "石棉", "金秀", "景洪", "青龙", "临川", "多伦", "库车",
			"新干", "宁远", "卢龙", "新和", "连县", "石河子", "兰考", "中江", "定陶", "阿鲁科尔沁旗",
			"顺德", "固安", "吉县", "呼玛", "成县", "德兴", "苍山", "阳江", "睢县", "贵南", "广昌",
			"英山", "丹棱", "施甸", "乾县", "萝北", "洛浦", "阜阳", "毫州", "榆次", "惠来", "锡林浩特",
			"陆川", "甘南州", "永泰", "南昌县", "浦江", "翼城", "蓬溪", "永宁", "和政", "塔城", "德昌",
			"泽普", "富锦", "凤庆", "万盛区", "淳化", "范县", "六合", "泽库", "福贡", "望城", "平湖",
			"砚山", "马尔康", "晋宁", "尤溪", "萧县", "尚义", "金沙", "桓台", "临沧", "祁连", "武宁",
			"平山", "安溪", "毕节", "白城", "吴桥", "隆林", "新郑", "高淳", "梓潼", "渭源", "武陟",
			"句容", "上林", "巴楚", "灯塔", "五河", "方正" };

	static Collection<String> names = Arrays.asList(cities);

	public FullCityNameSources() {

	}

	public Collection<String> getCityNames() {
		return names;
	}

}
