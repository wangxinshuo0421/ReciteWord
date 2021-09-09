package com.example.reciteword;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Data {
    private static List<Word> wordList = new ArrayList<>();
    /*单词清单*/
    static Word word0 = new Word("offspring","[ɔ:fspriŋ]","n. 子孙，后代",0,0);
    static Word word1 = new Word("adhere","[əd'hiə]","vi. 坚守于，对...忠贞; vt. 使附着",0,0);
    static Word word2 = new Word("abnormal","[æb'nɔ:məl]","adj. 反常的;n. 不正常的人",0,0);
    static Word word3 = new Word("monopoly","[mə'nɔpəli]","n. 垄断，专利，独占，控制",0,0);
    static Word word4 = new Word("vent","[vent]","v. 发泄，表达;n. 排气口，表达",0,0);
    static Word word5 = new Word("radioactive","[reidiəu'æktiv]","adj. 放射性的",0,0);
    static Word word6 = new Word("resort","[ri'zɔ:t]","n. (度假)胜地，手段;vi. 诉诸，常去",0,0);
    static Word word7 = new Word("litter","[litə]","n. 垃圾，杂乱;v. 乱丢垃圾，弄乱",0,0);
    static Word word8 = new Word("terror","[terə]","n. 恐怖，惊骇，令人惧怕或讨厌的人或事物",0,0);
    static Word word9 = new Word("transfer","[træns'fə:]","n. 迁移，移动;v. 调转，调任",0,0);
    static Word word10 = new Word("scare","[skɛə]","v. 受惊吓;n. 惊吓",0,0);
    static Word word11 = new Word("revive","[ri'vaiv]","vt. 使重生，恢复精神",0,0);
    static Word word12 = new Word("shiver","[ʃivə]","vt. 颤动;n. 冷颤",0,0);
    static Word word13 = new Word("lessen","[lesn]","v. 减少，变小，减轻",0,0);
    static Word word14 = new Word("identical","[ai'dentikəl]","adj. 相同的，同一的",0,0);
    static Word word15 = new Word("plausible","[plɔ:zəbl]","adj. 似真实合理的，似可信的",0,0);
    static Word word16 = new Word("perspective","[pə'spektiv]","n. 远景，看法;adj. 透视的",0,0);
    static Word word17 = new Word("accelerate","[æk'seləreit]","vt. 加速，提前;vi. 加速",0,0);
    static Word word18 = new Word("adjacent","[ə'dʒeisnt]","adj. 毗连的，邻近的",0,0);
    static Word word19 = new Word("anxiety","[æŋ'zaiəti]","n. 焦虑，担心，渴望",0,0);
    static Word word20 = new Word("capsule","[kæpsju:l]","vt. 装入胶囊，简缩;adj. 精简的",0,0);
    static Word word21 = new Word("enrich","[in'ritʃ]","vt. 使富足，使肥沃",0,0);
    static Word word22 = new Word("differentiate","[.difə'renʃi.eit]","vt. 识别，使差异;vi. 区别",0,0);
    static Word word23 = new Word("alternate","['ɔ:ltə:neit]","adj. 交替的，轮流的;v. 交替",0,0);
    static Word word24 = new Word("qualification","[kwɔlifi'keiʃən]","n. 资格，条件",0,0);
    static Word word25 = new Word("bounce","[bauns]","n. 跳，反跃;vt. 弹跳",0,0);
    static Word word26 = new Word("encounter","[in'kauntə]","n. 意外的相见;v. 遇到，偶然碰到",0,0);
    static Word word27 = new Word("dilute","[dai'lju:t]","vt. 冲淡，稀释;adj. 冲淡的，稀释的",0,0);
    static Word word28 = new Word("reinforce","[ri:in'fɔ:s]","vt. 加强;vi. 得到加强",0,0);
    static Word word29 = new Word("advantage","[əd'vɑ:ntidʒ]","n. 优势，有利条件;vt. 有利于",0,0);
    static Word word30 = new Word("consumption","[kən'sʌmpʃən]","n. 消费，消耗，消费量",0,0);
    static Word word31 = new Word("calculate","[kælkjuleit]","v. 计算，估计，核算",0,0);
    static Word word32 = new Word("mature","[mə'tjuə]","adj. 成熟的;v. 成熟",0,0);
    static Word word33 = new Word("virtual","[və:tjuəl]","adj. 虚拟的",0,0);
    static Word word34 = new Word("adapt","[ə'dæpt]","vt. 使适应;vi. 适应",0,0);
    static Word word35 = new Word("innovation","[inəu'veiʃən]","n. 创新，革新",0,0);
    static Word word36 = new Word("transit","[trænsit]","n. 经过，运输;vt.穿越",0,0);
    static Word word37 = new Word("compromise","[kɔmprəmaiz]","n. 妥协，折衷;vt. 妥协处理",0,0);
    static Word word38 = new Word("eliminate ","[i'limineit]","v. 除去",0,0);
    static Word word39 = new Word("lean","[li:n]","v. 倾斜，倚，屈身",0,0);
    static Word word40 = new Word("heighten","[haitn]","v. 增加",0,0);
    static Word word41 = new Word("thesis","[θi:sis]","n. 毕业论文，论题",0,0);
    static Word word42 = new Word("drawback","['drɔ:.bæk]","n. 弊，缺点，不利条件",0,0);
    static Word word43 = new Word("doom","[du:m]","n. 命运;vt. 注定",0,0);
    static Word word44 = new Word("choke","[tʃəuk]","vi. 窒息;n. 阻塞",0,0);
    static Word word45 = new Word("uphold","[ʌp'həuld]","v. 支撑，赞成",0,0);
    static Word word46 = new Word("combination","[kɔmbi'neiʃən]","n. 结合，联合",0,0);
    static Word word47 = new Word("occupation ","[ɔkju'peiʃən]","n. 职业，侵占，居住",0,0);
    static Word word48 = new Word("rupture","['rʌptʃə]","n. 破裂，断裂;v. 使破裂",0,0);
    static Word word49 = new Word("casual","['kæʒjuəl]","adj. 偶然的，随便的，非正式",0,0);
    static Word word50 = new Word("precise","[pri'sais]","adj. 精确的，准确的，严格的",0,0);
    static Word word51 = new Word("insulate","['insjuleit]","v. 使...绝缘，隔离",0,0);
    static Word word52 = new Word("occasional","[ə'keiʒənəl]","adj. 偶然的，不时的",0,0);
    static Word word53 = new Word("bankrupt","[bæŋkrʌpt]","adj. 破产的，贫穷的;n. 破产者",0,0);
    static Word word54 = new Word("integral","['intigrəl]","adj. 构成整体所必需的，完整的",0,0);
    static Word word55 = new Word("outbreak","['autbreik]","n. 爆发",0,0);
    static Word word56 = new Word("subsidy","[sʌbsidi]","n. 补助金，津贴",0,0);
    static Word word57 = new Word("occupy","['ɔkjupai]","vt. 占领，占用，占据",0,0);
    static Word word58 = new Word("skeptical","['skeptikəl]","adj. 怀疑的",0,0);
    static Word word59 = new Word("approach","[ə'prəutʃ]","n. 接近; 途径;v. 靠近，接近",0,0);
    static Word word60 = new Word("memorial","[mi'mɔ:riəl]","adj. 纪念的;n. 纪念碑(堂),",0,0);
    static Word word61 = new Word("afflict","[ə'flikt]","vt. 使苦恼，折磨",0,0);
    static Word word62 = new Word("ignorant","['ignərənt]","adj. 不知道的，无知的",0,0);
    static Word word63 = new Word("exert","[ig'zə:t]","vt. 运用，施加",0,0);
    static Word word64 = new Word("idle","['aidl]","adj. 无目的的，无聊的;vt. 虚度; 使空闲",0,0);
    static Word word65 = new Word("overcome","[əuvə'kʌm]","vt. 战胜，克服;vi. 获胜，赢",0,0);
    static Word word66 = new Word("stable","[steibl]","adj. 稳定的;n. 马厩，马棚",0,0);
    static Word word67 = new Word("toxic","[tɔksik]","adj. 有毒的;n. 有毒物质",0,0);
    static Word word68 = new Word("expose","[ik'spəuz]","vt. 揭露，使暴露",0,0);
    static Word word69 = new Word("vigorous","['vigərəs]","adj. 精力充沛的",0,0);
    static Word word70 = new Word("challenge","['tʃælindʒ]","n. 挑战;v. 向..挑战",0,0);
    static Word word71 = new Word("haunt","[hɔ:nt]","n. 常到的地方;vi. 徘徊",0,0);
    static Word word72 = new Word("designate","['dezigneit]","adj. 指定的",0,0);
    static Word word73 = new Word("fancy","['fænsi]","n. 想像力，幻想;adj. 想像的",0,0);
    static Word word74 = new Word("donate","['dəuneit]","vt. 捐赠",0,0);
    static Word word75 = new Word("slash","[slæʃ]","vi. 大幅度削减;vt. 猛砍",0,0);
    static Word word76 = new Word("remedy","['remidi]","n. 药物，治疗法;vt. 治疗",0,0);
    static Word word77 = new Word("furnish","[‘fə:niʃ]","vt. 布置，提供，装备",0,0);
    static Word word78 = new Word("cheerful","[’tʃiəfəl]","adj. 高兴的，快乐的",0,0);
    static Word word79 = new Word("conserve","[kən'sə:v]","n. 蜜饯，果酱;vt. 保存",0,0);
    static Word word80 = new Word("economical","[i:kə'nɔmikəl]","adj. 节俭的，经济的",0,0);
    static Word word81 = new Word("drain","[drein]","n. 下水道;v. 耗尽，排出",0,0);
    static Word word82 = new Word("murmur","['mə:mə]","n. 低语;v. 低语",0,0);
    static Word word83 = new Word("violate","[vaiəleit]","vt. 违犯，亵渎",0,0);
    static Word word84 = new Word("mall","[mɔ:l]","n. 林荫大道，商业街",0,0);
    static Word word85 = new Word("forerunner","['fɔ:.rʌnə]","n. 先驱，祖先，预兆",0,0);
    static Word word86 = new Word("foresee","[fɔ:'si:]","v. 预见，预知",0,0);
    static Word word87 = new Word("esteem","[is'ti:m]","n. 尊敬;vt. 认为，尊敬",0,0);
    static Word word88 = new Word("furthermore","['fə:ðə'mɔ:]","adv. 而且，此外",0,0);
    static Word word89 = new Word("explicit","[iks'plisit]","adj. 明确的，详述的",0,0);
    static Word word90 = new Word("betray","[bi'trei]","vt. 误导，出卖;vi. 证明...错误",0,0);

    public static void initWordList(){
        wordList.add(word0);    wordList.add(word10);    wordList.add(word20);
        wordList.add(word1);    wordList.add(word11);    wordList.add(word21);
        wordList.add(word2);    wordList.add(word12);    wordList.add(word22);
        wordList.add(word3);    wordList.add(word13);    wordList.add(word23);
        wordList.add(word4);    wordList.add(word14);    wordList.add(word24);
        wordList.add(word5);    wordList.add(word15);    wordList.add(word25);
        wordList.add(word6);    wordList.add(word16);    wordList.add(word26);
        wordList.add(word7);    wordList.add(word17);    wordList.add(word27);
        wordList.add(word8);    wordList.add(word18);    wordList.add(word28);
        wordList.add(word9);    wordList.add(word19);    wordList.add(word29);

        wordList.add(word30);    wordList.add(word40);    wordList.add(word50);
        wordList.add(word31);    wordList.add(word41);    wordList.add(word51);
        wordList.add(word32);    wordList.add(word42);    wordList.add(word52);
        wordList.add(word33);    wordList.add(word43);    wordList.add(word53);
        wordList.add(word34);    wordList.add(word44);    wordList.add(word54);
        wordList.add(word35);    wordList.add(word45);    wordList.add(word55);
        wordList.add(word36);    wordList.add(word46);    wordList.add(word56);
        wordList.add(word37);    wordList.add(word47);    wordList.add(word57);
        wordList.add(word38);    wordList.add(word48);    wordList.add(word58);
        wordList.add(word39);    wordList.add(word49);    wordList.add(word59);

        wordList.add(word60);    wordList.add(word70);    wordList.add(word80);
        wordList.add(word61);    wordList.add(word71);    wordList.add(word81);
        wordList.add(word62);    wordList.add(word72);    wordList.add(word82);
        wordList.add(word63);    wordList.add(word73);    wordList.add(word83);
        wordList.add(word64);    wordList.add(word74);    wordList.add(word84);
        wordList.add(word65);    wordList.add(word75);    wordList.add(word85);
        wordList.add(word66);    wordList.add(word76);    wordList.add(word86);
        wordList.add(word67);    wordList.add(word77);    wordList.add(word87);
        wordList.add(word68);    wordList.add(word78);    wordList.add(word88);
        wordList.add(word69);    wordList.add(word79);    wordList.add(word89);
        wordList.add(word90);
    }
    private static int numCount = 0,randNum = getNum(91);
    public static void setNumCount(int numCount){
        Data.numCount = numCount;
    }

    public static void setRandNum(){
        Data.randNum = getNum(91);
    }

    public static int getNumCount(){return numCount;}
    public static int getRandNum(){return randNum;}
    public static String getWord(int cnt){
        return wordList.get(cnt).getWord();
    }
    public static String getPron(int cnt){
        return wordList.get(cnt).getPron();
    }
    public static String getwordDefine(int cnt){
        return wordList.get(cnt).getDefinition();
    }
    public static int getShowNum(int cnt){
        return wordList.get(cnt).getShowNum();
    }

    private static int getNum(int endNum){
        if(endNum > 0){
            Random random = new Random();
            return random.nextInt(endNum);
        }
        return 0;
    }
}
