package layout;

<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:padding="20dp">

    <TextView
        android:id="@+id/tv_detail_title"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Title"
        android:textSize="22sp"
        android:textStyle="bold" />

    <TextView
        android:id="@+id/tv_detail_description"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Description"
        android:textSize="16sp"
        android:paddingTop="10dp" />
</LinearLayout>
