
import React from "react";
import { Select, MenuItem,InputLabel } from "@mui/material";
import { useField, useFormikContext } from "formik";

const SelectWrapper = ({ id,name, options,value,label,
   ...otherProps }) => {
  const { setFieldValue } = useFormikContext();
  const [field, meta] = useField(name);

  const handleChange = (evt) => {
    const { value } = evt.target;
    setFieldValue(name, value);
  };

  const configSelect = {
    ...field,
    ...otherProps,
    id,
    variant: "outlined",
    fullWidth: true,
    label,
    onChange: handleChange,
  };

  if (meta && meta.touched && meta.error) {
    configSelect.error = true;
    configSelect.helperText = meta.error;
  }

  return (
    <Select {...configSelect}>
      {Object.keys(options).map((item, pos) => (
        <MenuItem key={pos} value={item}>
          {options[item]}
        </MenuItem>
      ))}
    </Select>
  );
};

export default SelectWrapper;
