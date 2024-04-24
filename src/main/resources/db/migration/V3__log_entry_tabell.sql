CREATE TABLE log_entry (
    id         VARCHAR DEFAULT uuid_generate_v4() PRIMARY KEY,
    opprettet  TIMESTAMP WITH TIME ZONE
);
