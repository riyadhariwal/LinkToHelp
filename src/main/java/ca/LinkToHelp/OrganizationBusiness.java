package ca.LinkToHelp;

import java.util.ArrayList;

public class OrganizationBusiness {

    public ArrayList<Organization> getOrganizationList () {
        //href="/organization_list"
        ArrayList<Organization> organizationList = new ArrayList<>();

        organizationList.add(new Organization("Minerva", 49.282422, -123.108164, "PAY"));
        organizationList.add(new Organization("Ending Violence Associationg of British Columbia", 49.282290,
                -123.109120, "PHYSICAL"));
        organizationList.add(new Organization("YWCA", 49.285730, -123.117830, "CHILDREN"));
        organizationList.add(new Organization("WAVAW", 49.264340, -123.143940, "SEXUAL"));
        organizationList.add(new Organization("BWSS", 49.278980, -123.121480, "VERBAL"));
        organizationList.add(new Organization("Minerva", 49.282422, -123.108164, "WORKLIFE"));
        organizationList.add(new Organization("Ending Violence Associationg of British Columbia", 49.282290,
                -123.109120, "GENERAL"));

        return organizationList;
    }
}
