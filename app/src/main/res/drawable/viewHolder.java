package drawable;

public ArrayList<MoldeHotel> listaHotel;

    //CONSTRUCTOR
    public HotelAdaptador(ArrayList<MoldeHotel> listaHotel) {
        this.listaHotel = listaHotel;
    }

    @NonNull
    @Override
    public HotelAdaptador.viewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View vista= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.moldehotel,null,false);
        return new viewHolder(vista);

    }

    @Override
    public void onBindViewHolder(@NonNull HotelAdaptador.viewHolder viewHolder, int i) {
        viewHolder.actualizarDatos(listaHotel.get(i));

    }

    @Override
    public int getItemCount() {

        return  listaHotel.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        TextView nombreHotel;
        TextView precioHotel;
        ImageView fotoHotel;

        public viewHolder(View item) {
            super(item);
            fotoHotel=item.findViewById(R.id.fotoitem);
            nombreHotel=item.findViewById(R.id.tituloitem);
            precioHotel=item.findViewById(R.id.precioitem);
        }

        public void actualizarDatos(MoldeHotel moldeHotel) {
            fotoHotel.setImageResource(moldeHotel.getFoto());
            nombreHotel.setText(moldeHotel.getNombre());
            precioHotel.setText(moldeHotel.getPrecio());
        }
    }