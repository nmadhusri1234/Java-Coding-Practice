//package com.threads;
//
//class DownloadThread extends Thread
//{
//	
//}
//class UploadThread extends Thread
//{
//	
//}
//class PaymentThread extends Thread
//{
//	
//}
//public class ThreadNames {
//
//	public static void main(String[] args) {
//		
//		DownloadThread d = new DownloadThread();
//		System.out.println(d.getName());
//		d.setName("Download Thread");
//		System.out.println(d.getName());
//		
//		UploadThread u = new UploadThread();
//		System.out.println(u.getName());
//		u.setName("Upload Thread");
//		System.out.println(u.getName());
//		
//		PaymentThread p = new PaymentThread();
//		System.out.println(p.getName());
//		p.setName("Payment Thread");
//		System.out.println(p.getName());
//
//	}
//
//}



package com.threads;

class DownloadThread extends Thread {

    public void run() {
        System.out.println("Thread Name: " + getName());
    }
}

class UploadThread extends Thread {

    public void run() {
        System.out.println("Thread Name: " + getName());
    }
}

class PaymentThread extends Thread {

    public void run() {
        System.out.println("Thread Name: " + getName());
    }
}

public class ThreadNames {

    public static void main(String[] args) {

        DownloadThread d = new DownloadThread();
        UploadThread u = new UploadThread();
        PaymentThread p = new PaymentThread();

        d.setName("Download Thread");
        u.setName("Upload Thread");
        p.setName("Payment Thread");

        d.start();
        u.start();
        p.start();
    }
}
