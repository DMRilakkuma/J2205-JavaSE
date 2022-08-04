package lesson16.Exer2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-18 17:00
 * @Description:
 */

public class ContactTest {
    List<Contact> list = new ArrayList<>();

    public boolean addContact(Contact contact) {
        /*
         * @author MC
         * @description //TODO 添加时需要检查手机号和邮箱地址格式是否正确，若不正确，不允许添加
         * @createTime  2022-07-18 17:11
         * @param addContact
         * @return boolean
         **/

        String phoneNumber = contact.getPhoneNumber();
        String mails = contact.getMails();

        if (phoneNumber.length() != 11 || phoneNumber.charAt(0) == '0') {
            return false;
        }

        int indexOf = mails.indexOf('@');
        int lastIndexOf = mails.lastIndexOf('@');
        int i = mails.indexOf('.');
        if (indexOf != lastIndexOf) {
            return false;
        }

        if (indexOf == 0 || indexOf == mails.length() - 1) {
            return false;
        }

        if (i < indexOf || i == mails.length() - 1) {
            return false;
        }
        list.add(contact);
        return true;
    }


    public void inquiry(String name) {
        /*
         * @author MC
         * @description //TODO 联系人查询(输入姓名或电话查询)
         * @createTime  2022-07-18 17:11
         * @param inquiry
         * @return void
         **/

        for (Contact c : list) {
            if (name.equals(c.getName())) {
                System.out.println(c.toString());
                break;
            }
        }

    }

    public void show() {
        /*
         * @author MC
         * @description //TODO 显示联系人列表
         * @createTime  2022-07-18 17:13
         * @param show
         * @return void
         **/

        for (Contact c : list) {
            System.out.println(c.toString());
        }
    }

    public void delete(String id) {
        /*
         * @author MC
         * @description //TODO 根据编号删除指定联系人
         * @createTime  2022-07-18 17:15
         * @param delete
         * @return void
         **/


        for (int i = 0; i < list.size(); i++) {
            if (id.equals(list.get(i).getId())) {
                list.remove(i);
                break;
            }
        }
    }
}