package kunsan.kim.bagchecker;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class Data_BookAdapter extends RecyclerView.Adapter<Data_BookAdapter.ViewHolder>
{
	ArrayList<Data_Book> items = new ArrayList<Data_Book>();

	@NonNull
	@Override
	public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i)            //인플레이션을 통해 만든 뷰 객체
	{
		LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());            //p.423 참조
		View itemView = inflater.inflate(R.layout.book_item, viewGroup, false);
		return new ViewHolder(itemView);
	}

	@Override
	public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position)
	{
		Data_Book item = items.get(position);
		viewHolder.setItem(item);
	}

	@Override
	public int getItemCount()
	{
		return items.size();
	}

	public void addItem(Data_Book item)        //Book 객체를 각각 ArrayList 안에 넣어서 관리하는 코드 425쪽
	{
		items.add(item);
	}

	public void setItems(ArrayList<Data_Book> items)
	{
		this.items = items;
	}

	public Data_Book getItem(int position)
	{
		return items.get(position);
	}

	public void setItem(int position, Data_Book item)
	{
		items.set(position, item);
	}

	static class ViewHolder extends RecyclerView.ViewHolder        //뷰 홀더 클래스의 정의 421쪽
	{
		TextView textView;
		TextView textView2;

		public ViewHolder(View itemView)
		{
			super(itemView);

			textView = itemView.findViewById(R.id.textView);
			textView2 = itemView.findViewById(R.id.textView2);
		}

		public void setItem(Data_Book item)
		{
			textView.setText(item.getName());
			textView2.setText(item.getId());
		}
	}

}
