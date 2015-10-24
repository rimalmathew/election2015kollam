package in.nic.kollam.election15kollam;

import android.app.Activity;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;

import java.io.File;



public class ContactsActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
        setContentView(R.layout.activity_contacts);
        getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE, R.layout.contacts_title);

        File database=this.getDatabasePath("arjun");
        if(!database.exists())
        {
            Log.i("hello", "isnotthere");

            SQLiteDatabase sb = openOrCreateDatabase("arjun", MODE_PRIVATE, null);

            sb.execSQL("CREATE TABLE IF NOT EXISTS `police_officer_city` (\n" +
                    "  `name` varchar(100),\n" +
                    "  `designation` varchar(100),\n" +
                    "  `unit` varchar(100) ,\n" +
                    "  `mobileno` varchar(100),\n" +
                    "  `email` varchar(100)\n" +
                    ");");

            sb.execSQL("INSERT INTO `police_officer_city` (`name`, `designation`, `unit`, `mobileno`, `email`) VALUES\n" +
                    "('Shri P.PRAKASH ', 'District Police Chief', 'Kollam City ', '9497996984', 'cpklm.pol@kerala.gov.in '),\n" +
                    "('Shri GEORGE KOSHY', 'Asst. Commissioner of Police', 'ADMN ', '9497990020 ', 'acpadmklm.pol@kerala.gov.in '),\n" +
                    "('Shri JAYAPRAKASH', 'Asst. Commissioner of Police', 'DCRB ', '9497990021 ', 'acpcdklm.pol@kerala.gov.in '),\n" +
                    "('Shri REX BOBBY ARAVIN', 'Asst. Commissioner of Police', 'SB ', '9497990024 ', 'acpsbklm.pol@kerala.gov.in '),\n" +
                    "('Shri SANTHOSH MS ', 'Asst. Commissioner of Police', 'Kollam City ', '9497990025', 'acpklm.pol@kerala.gov.in '),\n" +
                    "('Shri SIVASUTHAN PILLAI ', 'Asst. Commissioner of Police', 'Karunagapally', '9497990027', 'acpkpyklm.pol@kerala.gov.in '),\n" +
                    "('Shri SIVAPRASAD .S ', 'Asst. Commissioner of Police', 'Chathannur ', '', 'acpchnrklm.pol@kerala.gov.in '),\n" +
                    "('Shri SHEREEF .S ', 'Circle Inspector of Police', 'Kollam East', '9497987030 ', 'ciklmeastklm.pol@kerala.gov.in '),\n" +
                    "('Shri R.SURESH', 'Circle Inspector of Police', 'Kollam West ', '9497987031', 'ciklmwestklm.pol@kerala.gov.in'),\n" +
                    "('Shri B.PANKAJAKSHAN ', 'Circle Inspector of Police', 'Kollam City ', '', ''),\n" +
                    "('Shri VISWAMBARAN.M ', 'Circle Inspector of Police', 'Eravipuram', '', 'cierviprmklm.pol@kerala.gov.in'),\n" +
                    "('Shri BIJU V.S', 'Circle Inspector of Police', 'Paravoor', '9497987032', 'ciprvrklm.pol@kerala.gov.in '),\n" +
                    "('Shri JOSHY.V ', 'Circle Inspector of Police', 'Kottiyam', '9497987033', 'cikotymklm.pol@kerala.gov.in '),\n" +
                    "('Shri VIDYADHARAN KA ', 'Circle Inspector of Police', 'Karunagapally', '9497987035', 'cikpyklm.pol@kerala.gov.in'),\n" +
                    "('Shri BINU SREEDHAR', 'Circle Inspector of Police', 'Chavara ', '9497987037', 'cichavaraklm.pol@kerala.gov.in'),\n" +
                    "('Shri RAMACHANDRAN.C', 'Circle Inspector of Police', 'Coastal', '9497987044', '');\n");


            sb.execSQL("CREATE TABLE IF NOT EXISTS `district_administration` (\n" +
                    "  `name` varchar(100),\n" +
                    "  `designation` varchar(100) ,\n" +
                    "  `mobile` varchar(12) \n" +
                    ");");

            sb.execSQL("INSERT INTO `district_administration` (`name`, `designation`, `mobile`) VALUES\n" +
                    "('Smt. A.SHAINAMOL IAS', 'District Election Officer & District Collector', '9447795500'),\n" +
                    "('Shri M.A.RAHIM', 'Additional District Magistrate', '8547610026'),\n" +
                    "('Shri C. SAJEEVE', 'Revenue Divisional Officer', '9447163461'),\n" +
                    "('Shri ANU S.NAIR', 'Deputy Collector (Election)', '8547610029'),\n" +
                    "('Shri K.T.VARGHESE PANICKER', 'Deputy Collector (LR)', '8547610030'),\n" +
                    "('Shri A. SHIBU', 'Deputy Collector (RR)', '8547610028'),\n" +
                    "('Shri R.P.MAHADEVAKUMAR', 'Deputy Collector (LANH)', '8547610031'),\n" +
                    "('Smt.J.GIRIJA', 'Deputy Collector (LA)', '8547610027'),\n" +
                    "('Shri SHAJI KUMAR.L', 'District Law Officer', '9446563560'),\n" +
                    "('Shri JAYASANKAR.K.G', 'Finace Officer', '8547610033'),\n" +
                    "('Shri K. ABDUL RASHEED', 'District Information Officer', '9496003214'),\n" +
                    "('Shri V.K. SATHEESH KUMAR', 'District Infomatics Officer', '9446033678'),\n" +
                    "('Shri M.H.SHANAVASKHAN', 'Tahsildar, Kollam', '9447194116'),\n" +
                    "('Shri A.BASHEERKUNJU', 'Tahsildar, Karunagapally', '9447080223'),\n" +
                    "('Shri ALEX P THOMAS', 'Tahsildar, Kunnathur', '9447170345'),\n" +
                    "('Shri SOMASUNDARAN PILLAI', 'Tahsildar, Kottarakkara', '9447184623'),\n" +
                    "('Shri PRADEEP KUMAR', 'Tahsildar, Pathanapuram', '9447191605'),\n" +
                    "('Shri B. SASIKUMAR', 'Tahsildar, Punalur', '9544715555'),\n" +
                    "('Shri D.R.SABU', 'Asst.District Information Officer', '9847020388'),\n" +
                    "('Shri B.K.BALARAJ', 'Rejional Joint Director Urban affairs', '9447653725'),\n" +
                    "('Shri C.R. SURESH', 'Deputy Director of Panchayath Collectorate Kollam', '9496041700'),\n" +
                    "('Shri. JOHNSON PREMKUMAR', 'Asst. Development Commissioner (General) Kollam', '9447768793');\n");


            sb.execSQL("CREATE TABLE IF NOT EXISTS `station_house_officers_city` (\n" +
                    "  `station_name` varchar(50),\n" +
                    "  `number` varchar(20) \n" +
                    ");");



            sb.execSQL("INSERT INTO `station_house_officers_city` (`station_name`, `number`) VALUES\n" +
                    "('KOLLAM EAST', '9497980175'),\n" +
                    "('KOLLAM EAST', '9497980176'),\n" +
                    "('KOLLAM EAST', '9497980177'),\n" +
                    "('KOLLAM EAST', '9497980178'),\n" +
                    "('KOLLAM EAST', '9497980179'),\n" +
                    "('KOLLAM EAST', '9497980180'),\n" +
                    "('ERAVIPURAM', '9497980215'),\n" +
                    "('ERAVIPURAM', '9497980216'),\n" +
                    "('KILIKOLLOOR', '9497980174'),\n" +
                    "('KOLLAM WEST', '9497980181'),\n" +
                    "('PALLITHOTTAM', '9497980198'),\n" +
                    "('PALLITHOTTAM', '9497980199'),\n" +
                    "('OACHIRA', '9497980197'),\n" +
                    "('CHAVARA', '9497980164'),\n" +
                    "('CHAVARA', '9497980165'),\n" +
                    "('WOMEN CELL', '9497980221'),\n" +
                    "('WOMEN CELL', '9497980222'),\n" +
                    "('COASTAL PS', '9497980191'),\n" +
                    "('TRAFFIC', '9497980860'),\n" +
                    "('TRAFFIC', '9497980858'),\n" +
                    "('ANCHALUMOODU', '9497980159'),\n" +
                    "('ANCHALUMOODU', '9497980160'),\n" +
                    "('CHATHANNUR', '9497980162'),\n" +
                    "('CHATHANNUR', '9497980163'),\n" +
                    "('KOTTIYAM', '9497980189'),\n" +
                    "('KOTTIYAM', '9497980190'),\n" +
                    "('PARAVUR', '9497980200'),\n" +
                    "('PARIPALLY', '9497980201'),\n" +
                    "('KARUNAGAPALLY', '9497980171'),\n" +
                    "('KARUNAGAPALLY', '9497980172'),\n" +
                    "('KARUNAGAPALLY', '9497980173'),\n" +
                    "('SAKTHIKULANGARA', '9497980209'),\n" +
                    "('CHAVARA SOUTH', '9497980166'),\n" +
                    "('SB', '9497980223'),\n" +
                    "('SB', '9497980224'),\n" +
                    "('SB', '9497980225');\n");



            sb.execSQL("CREATE TABLE IF NOT EXISTS `police_officers_kollam_rural` (\n" +
                    "  `name` varchar(100) ,\n" +
                    "  `unit` varchar(100) ,\n" +
                    "  `mobile` varchar(12),\n" +
                    "  `emai` varchar(100) ,\n" +
                    "  `designation` varchar(100) \n" +
                    ");");
            sb.execSQL("INSERT INTO `police_officers_kollam_rural` (`name`, `unit`, `mobile`, `emai`, `designation`) VALUES\n" +
                    "('Shri ANIL DAS.S', 'Kottarakkara', '9497975154', 'dyspkkzklmrl.pol@kerala.gov.in', 'Deputy Superintendent of Police'),\n" +
                    "('Shri JOHN KUTTY', 'ADMN', '9497975155', '', 'Deputy Superintendent of Police'),\n" +
                    "('Shri ABDUL RASHI', 'DST SB', '9497975183', 'dyspsbklmrl.pol@kerala.gov.in', 'Deputy Superintendent of Police'),\n" +
                    "('Shri SADAN.K', 'Kundara', '9497987034', 'cidrlklmrl.pol@kerala.gov.in', 'Circle Inspector of Police'),\n" +
                    "('Shri PRASAD.A', 'Sashtamcotta', '9497987036', 'Cistktaklmrl.pol.kerala.gov.in', 'Circle Inspector of Police'),\n" +
                    "('Shri SIRESH KUMAR.M', 'Punalur', '9497987038', 'cipnlrklmrl.pol@kerala.gov.in', 'Circle Inspector of Police'),\n" +
                    "('Shri MANOJ CHANDRAN', 'Kottarakkara', '9497987039', 'cikkskklmrl.pol@kerala.gov.in', 'Circle Inspector of Police'),\n" +
                    "('Shri DILEEPKUMAR DAS', 'Kadakkal', '9497987040', 'cikdklklmrl.pol@kerala.gov.in', 'Circle Inspector of Police'),\n" +
                    "('Shri SUDHEER C.L', 'Kulathupuzha', '9497987041', 'ciktzklmrl.pol@kerala.gov.in', 'Circle Inspector of Police'),\n" +
                    "('Shri MAJOJ KUMAR', 'Anchal', '9497987042', 'ciachlklmrl.pol@kerala.gov.in', 'Circle Inspector of Police'),\n" +
                    "('Shri RAMESH KUMAR PV', 'Ezhukone', '9497987043', ' ciezhknklmrl.pol@kerala.gov.in', 'Circle Inspector of Police'),\n" +
                    "('Shri R.BAIJUKUMAR', 'Pathanapuram', '9497987044', '', 'Circle Inspector of Police'),\n" +
                    "('Shri J.HEMENDRANATH IPS', 'Punalur', '9497990026', 'dysppnrklmrl.pol@kerala.gov.in', 'Deputy Superintendent of Police'),\n" +
                    "('Shri VIYAYAKUMARAN NAIR', 'DCRB', '9497990325', '', 'Deputy Superintendent of Police'),\n" +
                    "('Shri SASIKUMAR IPS', 'Kollam Rural', '9497996908', 'spklmr.pol@kerala.gov.in', 'District Police Chief');\n");

            sb.execSQL("CREATE TABLE IF NOT EXISTS `district_election_wing` (\n" +
                    "  `name` varchar(100) ,\n" +
                    "  `designation` varchar(100),\n" +
                    "  `mobile` varchar(12) \n" +
                    ");");
            sb.execSQL("INSERT INTO `district_election_wing` (`name`, `designation`, `mobile`) VALUES\n" +
                    "('Shri ANU S. NAIR', 'Deputy Collector Election', '9447795500'),\n" +
                    "('Shri ANIL PHILIP', 'Junior Superintendent', '9447010409'),\n" +
                    "('Shri PRAVEEN.S', 'Head Clerk', '9745110055'),\n" +
                    "('Shri ANIL KUMR', 'Senior Clerk', ''),\n" +
                    "('Shri NISSARUDEEN.Y', 'Senior Clerk', '9744444030'),\n" +
                    "('Shri ANOOP', 'Clerk', ' 7736824300'),\n" +
                    "('Shri SURESH KUMAR. A', 'Clerk', ' 9846825462'),\n" +
                    "('Smt.MAYA.S', 'UD Typist', '9567619327'),\n" +
                    "('Shri SANTHOSH K.G', 'Office Attendant', ''),\n" +
                    "('Shri SHAMNAD.A', 'Office Attendant', ''),\n" +
                    "('Shri DINESH', 'Clerk', '9747052425'),\n" +
                    "('Shri SABU', 'Driver', '8086450093'),\n" +
                    "('Shri NAVAS', 'District Programmer', '9744007222'),\n" +
                    "('Shri ANU S. NAIR', 'Deputy Collector Election', '447795500'),\n" +
                    "('Shri ANIL PHILIP', 'Junior Superintendent', '9447010409'),\n" +
                    "('Shri PRAVEEN.S', 'Head Clerk', '9745110055'),\n" +
                    "('Shri ANIL KUMR', 'Senior Clerk', ''),\n" +
                    "('Shri NISSARUDEEN.Y', 'Senior Clerk', '9744444030'),\n" +
                    "('Shri ANOOP', 'Clerk', ' 7736824300'),\n" +
                    "('Shri SURESH KUMAR. A', 'Clerk', ' 9846825462'),\n" +
                    "('Smt.MAYA.S', 'UD Typist', '9567619327'),\n" +
                    "('Shri SANTHOSH K.G', 'Office Attendant', ''),\n" +
                    "('Shri SHAMNAD.A', 'Office Attendant', ''),\n" +
                    "('Shri DINESH', 'Clerk', '9747052425'),\n" +
                    "('Shri SABU', 'Driver', '8086450093'),\n" +
                    "('Shri NAVAS', 'District Programmer', '9744007222');\n");



            sb.execSQL("CREATE TABLE `state_election_commission` (\n" +
                    "  `name` varchar(100),\n" +
                    "  `designation` varchar(100),\n" +
                    "  `mobile` varchar(12)\n" +
                    ");");

            sb.execSQL("INSERT INTO `state_election_commission` (`name`, `designation`, `mobile`) VALUES\n" +
                    "('Smt. P. GEETHA', 'Secretary', '9495916157'),\n" +
                    "('Shri ANSARI.A', 'Senior Administrative Officer', '9447857716'),\n" +
                    "('Shri FRANCIS D''CRUZ. P', 'Additional Secretary I', '9400852450'),\n" +
                    "('Shri K.V. MURALEEDHARAN', 'Additional Secretary II', '9847134341'),\n" +
                    "('Shri A.SALIM', 'Additional Secretary  III', '9497858572'),\n" +
                    "('Shri P.O.JOSE', 'Law Officer', '9446020544'),\n" +
                    "('Shri.V.RAJENDRAN', 'Senior Finance Manager', '9446412116'),\n" +
                    "('Shri RADHAKRISHNA KURUP', 'Joint Secretary (M)', '9447556949'),\n" +
                    "('Shri EAPEN FRANCIS', 'Joint Secretary (P)', '9447780516'),\n" +
                    "('Shri N.E. MEGHANAD', 'Consultant', '9895020103'),\n" +
                    "('Shri.K.SANTHOSH KUMAR', 'P.R.O', '8281000127'),\n" +
                    "('Shri K.S. SURESH KUMAR', 'Section Officer (Election)', '9633070686'),\n" +
                    "('Smt. SREEKALA. M.S', 'Section Officer (Estt.)', '9495959868'),\n" +
                    "('Shri K.T. GEORGE', 'P.S. to Commissioner', '9447589017'),\n" +
                    "('Shri V.V. RAJEEV', 'Court Assistant', '9447791524'),\n" +
                    "('Shri MANJITH.S', 'Computer Programmer', '9846040739'),\n" +
                    "('Smt. SUSEELA.A', 'C.A. to Commissioner', '9446352982'),\n" +
                    "('Shri S.K.PRASAD', 'C.A. to Secretary', '9048090988');");


            sb.execSQL("CREATE TABLE IF NOT EXISTS `station_house_officers_rural` (\n" +
                    "  `station_name` varchar(100) ,\n" +
                    "  `number` varchar(12)\n" +
                    ");");
            sb.execSQL("INSERT INTO `station_house_officers_rural` (`station_name`, `number`) VALUES\n" +
                    "('KOTTARAKKARA', '9497980183'),\n" +
                    "('KOTTARAKKARA', '9497980184'),\n" +
                    "('KOTTARAKKARA', '9497960717'),\n" +
                    "('KOTTARAKKARA', '9497960718'),\n" +
                    "('KOTTARAKKARA', '9497960719'),\n" +
                    "('KUNDARA', '9497980193'),\n" +
                    "('SOORANADU', '9497980212'),\n" +
                    "('TRAFFIC UNIT KTR', '9497980186'),\n" +
                    "('THENMALA', '9497980213'),\n" +
                    "('YEROOR', '9497980214'),\n" +
                    "('ANCHAL', '9497980157'),\n" +
                    "('KUNNICODE', '9497980196'),\n" +
                    "('POOYAPPALLY', '9497980204'),\n" +
                    "('KADAKKAL', '9497980169'),\n" +
                    "('KULATHUPUZHA', '9497980192'),\n" +
                    "('PUTHUR', '9497990319'),\n" +
                    "('CHADAYAMANGALAM', '9497980161'),\n" +
                    "('PUNALUR', '9497980205'),\n" +
                    "('EAST KALLADA', '9497980167'),\n" +
                    "('PATHANAPURAM', '9497980202'),\n" +
                    "('EZHUKONE', '9497980168'),\n" +
                    "('SASTHAMCOTTA', '9497980210'),\n" +
                    "('SASTHAMCOTTA', '9497960722'),\n" +
                    "('SB', '9497975132'),\n" +
                    "('SB', '9497975132'),\n" +
                    "('WOMEN CELL', '9497960853');\n");

            sb.execSQL("CREATE TABLE IF NOT EXISTS `block_resourse_personnel` (\n" +
                    "  `block` varchar(100),\n" +
                    "  `name` varchar(100),\n" +
                    "  `designation` varchar(100),\n" +
                    "  `office` varchar(100),\n" +
                    "  `mobile` varchar(12),\n" +
                    "  `d` int(11)\n" +
                    ");");

            sb.execSQL("INSERT INTO `block_resourse_personnel` (`block`, `name`, `designation`, `office`, `mobile`, `d`) VALUES\n" +
                    "('Chavara', 'Shri Prakash.G', 'Senior Clerk', 'Taluk Office Karuangapally', '9496370872', 1),\n" +
                    "('Mukhathala', 'Shri Babu .P', 'Junior spdt', 'Collectorate, kollam', '7403268778', 2),\n" +
                    "('Chittumala', 'Shri Rajesh.B', 'Senior Clerk', 'Collectorate, Kollam', '8547512609', 3),\n" +
                    "('Mukhathala', 'Shri M .Raveendran pillay', 'Village officer', 'Iravipuram', '8547610511', 4),\n" +
                    "('Chadayamangalam', 'Shri Sunil Kumar', 'Village Officer', 'Neduvathur', '8547610603', 5),\n" +
                    "('Kottarakkara', 'Shri Suresh Kumar.KG', 'Village Officer', 'Puthur', '8547610608', 6),\n" +
                    "('Kottarakkara', 'Shri Vijayakumar.S', 'Village Officer', 'Veliyam', '8547610613', 7),\n" +
                    "('Ithikkara', 'Shri G.Raji', 'Village Officer', 'Kareepra', '8547610615', 8),\n" +
                    "('Chadayamangalam', 'Shri Anil Kumar', 'Village Officer', 'Chadayamangalam', '8547610623', 9),\n" +
                    "('Mukhathala', ' Shri Binu .N', 'Village Assistant', 'Vadakkevila', '9446263600', 10),\n" +
                    "('Pathanapram', 'Shri S.Udayan', 'Deputy Tahsildar', 'Taluk Office Pathanapuram', '9446358440', 11),\n" +
                    "('Chadayamangalam', 'Shri Shiju Y Das', 'Senior Clerk', ' Collectorate Kollam', '9446406994', 12),\n" +
                    "('Vettikavala', 'Shri Rajendran.G', 'Deputy Tahsildar', 'Taluk Office Kottarakkara', '9446826324', 13),\n" +
                    "('Shasthamcotta', 'Shri K.Rajesh Kumar', 'Senior Clerk', 'Taluk Office Kunnathu', '9447222067', 14),\n" +
                    "('Anchal', 'Shri Suresh.K', 'Deputy Tahsildar', 'Taluk Office Punalur', '9447322270', 15),\n" +
                    "('Oachira', 'Shri S.Sajeed', 'Deputy Tahsildar', 'Taluk Office Karunagapally', '9447322940', 16),\n" +
                    "('Shasthamcotta', 'Shri G.Hareesh Kumar', 'Village Officer', ' Sasthamcotta', '9447323336', 17),\n" +
                    "('Ithikkara', 'Shri M.Kamarudeen', 'Valuation Assistant', 'LANHAI Ayathl', '9447713913', 18),\n" +
                    "('Pathanapram', 'Shri Sreejith .S', 'Senior Clerk', 'Taluk Office Pathanapuram', '9495132254', 19),\n" +
                    "('Anchal', 'Padmachandra kurup.C', 'Deputy Tahsildar', 'Taluk Office Punalur', '9495660660', 20),\n" +
                    "('Kottarakkara', 'Shri Jose Raju', 'Deputy Tahsildar', 'Taluk Office Kottarakkara', '9495752476', 21),\n" +
                    "('Ithikkara', 'Shri Jemini Kumar.K', 'Sr. Clerk', ' Taluk Office', '9496106073', 22),\n" +
                    "('Anchal', 'Shri Subhan.P', 'Deputy Tahsildar', 'Taluk Office Punalur', '9496150291', 23),\n" +
                    "('Chavara', 'Shri S.Jayachandran', 'SVO', ' Village Office Karunagapally', '9496411922', 24),\n" +
                    "('Vettikavala', 'Shri Joby.V', 'Senior Clerk', 'Taluk Office Kottarakkara', '9497131648', 25),\n" +
                    "('Oachira', 'Shri K.Anil Kumar', 'Clerk', 'Taluk Office Karunagapally', '9497670097', 26),\n" +
                    "('Shasthamcotta', 'Shri Robinson .Y.D', 'Senior Clerk, ', 'Collectorate Kollam', '9539144923', 27),\n" +
                    "('Chittumala', 'Shri Prasanth.G', 'SVO', 'Village Office, Perinadu', '9567762116', 28),\n" +
                    "('Vettikavala', 'Shri N.Veenadharan', 'Deputy Tahsildar', 'Taluk Office Kottarakkara', '9633449494', 29),\n" +
                    "('Pathanapram', 'Shri A.K.Monachan', 'Deputy Tahsildar', 'Taluk Office Pathanapuram', '9847286239', 30),\n" +
                    "('Chittumala', 'Shri Subhash .C', 'Village Officer', 'Saktikulangara', '9995396025', 31),\n" +
                    "('Chavara', 'Shri T.Y.Shiju', 'Senior Clerk', 'Taluk Office Karunagapally', '9995474044', 32),\n" +
                    "('Oachira', 'Shri Unnikrishnan.K', 'Senior Clerk', 'Taluk Office Karuangapally', '9995512035', 33);\n");

        }
        else
        {
            Log.i("hello","is there");
        }


















        Button button1= (Button) findViewById(R.id.sec);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ContactsActivity.this, contacts.class);
                i.putExtra("number", "1");
                startActivity(i);
            }
        });
        Button button2= (Button) findViewById(R.id.da);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(ContactsActivity.this,contacts.class);
                i.putExtra("number","2");
                startActivity(i);
            }
        });
        Button button3= (Button) findViewById(R.id.dew);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(ContactsActivity.this,contacts.class);
                i.putExtra("number","3");
                startActivity(i);
            }
        });
        Button button4= (Button) findViewById(R.id.poc);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(ContactsActivity.this,contacts.class);
                i.putExtra("number","4");
                startActivity(i);
            }
        });
        Button button5= (Button) findViewById(R.id.pokr);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(ContactsActivity.this,contacts.class);
                i.putExtra("number","5");
                Log.e("in pokr","pokr");
                startActivity(i);
            }
        });
        Button button6= (Button) findViewById(R.id.brp);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(ContactsActivity.this,contacts.class);
                i.putExtra("number","6");
                Log.e("in brp","in brp");
                startActivity(i);
            }
        });

   /*     ArrayList<String> x=new ArrayList<String>();
        x.add("STATE ELECTION COMMISSION, KERALA ");
        x.add("DISTRICT ADMINISTRATION  ");
        x.add("DISTRICT ELECTION WING ");
        x.add("POLICE OFFICERS IN KOLLM CITY ");
        x.add("POLICE OFFICERS IN KOLLM RURAL  ");
        ArrayAdapter<String> adapter=new ArrayAdapter<>(this,simple_list_item_1,x);
        ListView lv=(ListView)findViewById(R.id.listView);
        lv.setAdapter(adapter);*/
 /*SQLiteDatabase sb = openOrCreateDatabase("election", MODE_PRIVATE, null);
            sb.execSQL("CREATE TABLE IF NOT EXISTS `police_officer_city` (\n" +
                    "  `name` varchar(100) NOT NULL,\n" +
                    "  `designation` varchar(100) NOT NULL,\n" +
                    "  `unit` varchar(100) NOT NULL,\n" +
                    "  `mobileno` varchar(100) NOT NULL,\n" +
                    "  `email` varchar(100) NOT NULL\n" +
                    ");");

            sb.execSQL("INSERT INTO `police_officer_city` (`name`, `designation`, `unit`, `mobileno`, `email`) VALUES\n" +
                    "('Shri P.PRAKASH ', 'District Police Chief', 'Kollam City ', '9497996984', 'cpklm.pol@kerala.gov.in '),\n" +
                    "('Shri GEORGE KOSHY', 'Asst. Commissioner of Police', 'ADMN ', '9497990020 ', 'acpadmklm.pol@kerala.gov.in '),\n" +
                    "('Shri JAYAPRAKASH', 'Asst. Commissioner of Police', 'DCRB ', '9497990021 ', 'acpcdklm.pol@kerala.gov.in '),\n" +
                    "('Shri REX BOBBY ARAVIN', 'Asst. Commissioner of Police', 'SB ', '9497990024 ', 'acpsbklm.pol@kerala.gov.in '),\n" +
                    "('Shri SANTHOSH MS ', 'Asst. Commissioner of Police', 'Kollam City ', '9497990025', 'acpklm.pol@kerala.gov.in '),\n" +
                    "('Shri SIVASUTHAN PILLAI ', 'Asst. Commissioner of Police', 'Karunagapally', '9497990027', 'acpkpyklm.pol@kerala.gov.in '),\n" +
                    "('Shri SIVAPRASAD .S ', 'Asst. Commissioner of Police', 'Chathannur ', '', 'acpchnrklm.pol@kerala.gov.in '),\n" +
                    "('Shri SHEREEF .S ', 'Circle Inspector of Police', 'Kollam East', '9497987030 ', 'ciklmeastklm.pol@kerala.gov.in '),\n" +
                    "('Shri R.SURESH', 'Circle Inspector of Police', 'Kollam West ', '9497987031', 'ciklmwestklm.pol@kerala.gov.in'),\n" +
                    "('Shri B.PANKAJAKSHAN ', 'Circle Inspector of Police', 'Kollam City ', '', ''),\n" +
                    "('Shri VISWAMBARAN.M ', 'Circle Inspector of Police', 'Eravipuram', '', 'cierviprmklm.pol@kerala.gov.in'),\n" +
                    "('Shri BIJU V.S', 'Circle Inspector of Police', 'Paravoor', '9497987032', 'ciprvrklm.pol@kerala.gov.in '),\n" +
                    "('Shri JOSHY.V ', 'Circle Inspector of Police', 'Kottiyam', '9497987033', 'cikotymklm.pol@kerala.gov.in '),\n" +
                    "('Shri VIDYADHARAN KA ', 'Circle Inspector of Police', 'Karunagapally', '9497987035', 'cikpyklm.pol@kerala.gov.in'),\n" +
                    "('Shri BINU SREEDHAR', 'Circle Inspector of Police', 'Chavara ', '9497987037', 'cichavaraklm.pol@kerala.gov.in'),\n" +
                    "('Shri RAMACHANDRAN.C', 'Circle Inspector of Police', 'Coastal', '9497987044', '');\n");
*/
    }

    /*@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_contacts, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }*/
}
